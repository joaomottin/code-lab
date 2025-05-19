using API.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

var builder = WebApplication.CreateBuilder(args);
builder.Services.AddDbContext<AppDataContext>();

builder.Services.AddCors(options =>
    options.AddPolicy("Acesso Total",
        configs => configs
            .AllowAnyOrigin()
            .AllowAnyHeader()
            .AllowAnyMethod())
);

var app = builder.Build();

//EndPoints - Funcionalidades
//GET: /api/categoria/listar
app.MapGet("/api/categorias", ([FromServices] AppDataContext ctx) =>
{
    if (ctx.Categorias.Any())
    {
        return Results.Ok(ctx.Categorias.ToList());
    }
    return Results.NotFound();
});

//POST: /api/categoria/cadastrar
app.MapPost("/api/categorias", ([FromBody] Categoria categoria,
    [FromServices] AppDataContext ctx) =>
{
    ctx.Categorias.Add(categoria);
    ctx.SaveChanges();
    return Results.Created("/api/categorias/"+categoria.Id, categoria);
});

//PUT: /api/produto/alterar/{id}
app.MapPut("/api/categorias/{id}", ([FromRoute] int id,
    [FromBody] Categoria categoriaAlterada,
    [FromServices] AppDataContext ctx) =>
{
    Categoria? categoria = ctx.Categorias.Find(id);
    if (categoria == null)
    {
        return Results.NotFound();
    }

    categoria.Nome = categoriaAlterada.Nome;
 
    ctx.Categorias.Update(categoria);
    ctx.SaveChanges();
    return Results.Ok(categoria);
});

//GET: /api/produto/listar
app.MapGet("/api/produtos", ([FromServices] AppDataContext ctx) =>
{
    if (ctx.Produtos.Any())
    {
        return Results.Ok(ctx.Produtos.Include(x => x.Categoria).ToList());
    }
    return Results.NotFound();
});

//GET: /api/produto/buscar/{id}
app.MapGet("/api/produtos/{id}", ([FromRoute] string id,
    [FromServices] AppDataContext ctx) =>
{
    //Expressão lambda em C#
    // Produto? produto = ctx.Produtos.FirstOrDefault(x => x.Nome == "Variável com o nome do produto");
    // List<Produto> lista = ctx.Produtos.Where(x => x.Quantidade > 10).ToList();
    Produto? produto = ctx.Produtos.Find(id);
    if (produto == null)
    {
        return Results.NotFound();
    }
    return Results.Ok(produto);
});

//POST: /api/produto/cadastrar
app.MapPost("/api/produtos", ([FromBody] Produto produto,
    [FromServices] AppDataContext ctx) =>
{
    Categoria? categoria = ctx.Categorias.Find(produto.CategoriaId);
    if (categoria is null)
    {
        return Results.NotFound();
    }
    produto.Categoria = categoria;
    ctx.Produtos.Add(produto);
    ctx.SaveChanges();
    return Results.Created("/api/categorias/"+produto.Id, produto);
});

//DELETE: /api/produto/deletar/{id}
app.MapDelete("/api/produtos/{id}", ([FromRoute] string id,
    [FromServices] AppDataContext ctx) =>
{
    Produto? produto = ctx.Produtos.Find(id);
    if (produto == null)
    {
        return Results.NotFound();
    }
    ctx.Produtos.Remove(produto);
    ctx.SaveChanges();
    return Results.Ok(produto);
});

//PUT: /api/produto/alterar/{id}
app.MapPut("/api/produtos/{id}", ([FromRoute] string id,
    [FromBody] Produto produtoAlterado,
    [FromServices] AppDataContext ctx) =>
{
    Produto? produto = ctx.Produtos.Find(id);
    if (produto == null)
    {
        return Results.NotFound();
    }
    Categoria? categoria = ctx.Categorias.Find(produto.CategoriaId);
    if (categoria is null)
    {
        return Results.NotFound();
    }
    produto.Categoria = categoria;
    produto.Nome = produtoAlterado.Nome;
    produto.Quantidade = produtoAlterado.Quantidade;
    produto.Preco = produtoAlterado.Preco;
    ctx.Produtos.Update(produto);
    ctx.SaveChanges();
    return Results.Ok(produto);
});

app.UseCors("Acesso Total");

app.Run();
