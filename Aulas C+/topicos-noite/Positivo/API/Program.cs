using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using Namespace;

var builder = WebApplication.CreateBuilder(args);
builder.Services.AddDbContext<AppDataContext>();

var app = builder.Build();

// Lista todos os cursos cadastrados
app.MapGet("/", ([FromServices] AppDataContext ctx) => {
    if (ctx.Cursos.Any()) {
        return Results.Ok(ctx.Cursos.ToList());
    }
    return Results.NotFound();
});

// Busca o curso pelo identificador
app.MapGet("/{id}", ([FromRoute] int id,
                     [FromServices] AppDataContext ctx) => {
    if (ctx.Cursos.Any()) {
        return Results.Ok(ctx.Cursos.Include(curso => curso.Id == id));
    }
    return Results.NotFound();
});

// cadastrar um novo curso
app.MapPost("/", ([FromBody] Curso curso,
                  [FromServices] AppDataContext ctx) => {

    if (ctx.Cursos.Any()) {    
        ctx.Cursos.Add(curso);
        ctx.SaveChanges();
        return Results.Ok(curso);
    }
    
    return Results.NotFound();
});


app.Run();
