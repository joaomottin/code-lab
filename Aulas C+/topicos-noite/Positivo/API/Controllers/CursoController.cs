using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using Namespace;

namespace API.Controllers;

[ApiController]
[Route("api/cursos")]
public class CursoController : ControllerBase
{
    private readonly AppDataContext _context;
    public CursoController(AppDataContext context) {
        this._context = context;
    }

    [HttpGet]
    public IActionResult ListAll() {
        List<Curso> cursos = _context.Cursos
                                     .Include(c => c.Escola)
                                     .ToList();
        return Ok(cursos);
    }

    [HttpGet("{id}")]
    public IActionResult FindById(int id) {
        var curso = _context.Cursos
                            .Include(c => c.Escola) 
                            .FirstOrDefault(c => c.Id == id);
        if (curso == null) {
            return NotFound();
        }

        return Ok(curso);    
    }

    [HttpPost]
    public IActionResult Create(Curso curso) {

        var escola = _context.Escolas.Find(curso.Escola.Id);

        if (escola == null) {
            return NotFound("Escola não encontrada");
        }

        curso.Escola = escola;
        _context.Cursos.Add(curso);
        _context.SaveChanges();

        return Created("", curso);
    }

    [HttpPut("{id}")]
    public IActionResult Update(int id, Curso curso) {   
        var entitidade = _context.Cursos.Find(id);
        if (entitidade == null) {
            return NotFound("Curso não encontrado");
        }

        var escola = _context.Escolas.Find(curso.Escola.Id);
        if (escola == null) {
            return NotFound("Escola não encontrada");
        }

        entitidade.Escola = escola;
        entitidade.Name = curso.Name;

        _context.Cursos.Update(entitidade);
        _context.SaveChanges();
        return Ok(entitidade);
    }

    [HttpDelete("{id}")]
    public IActionResult Delete(int id) {   
        var curso = _context.Cursos.Find(id);
        if (curso == null) {
            return NotFound();
        }
       
        _context.Cursos.Remove(curso);
        _context.SaveChanges();
        return NoContent();
    }
}
