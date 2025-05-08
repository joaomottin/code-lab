using API.Modelos;
using Microsoft.AspNetCore.Mvc;
using Namespace;

namespace API.Controllers;

[ApiController]
[Route("api/escolas")]
public class EscolaController : ControllerBase
{
    private readonly AppDataContext _context;
    public EscolaController(AppDataContext context) {
        this._context = context;
    }

    [HttpGet]
    public IActionResult ListAll() {
        List<Escola> escolas = _context.Escolas.ToList();
        return Ok(escolas);
    }

    [HttpGet("{id}")]
    public IActionResult FindById(int id) {
        var escola = _context.Escolas.Find(id);
        if (escola == null) {
            return NotFound();
        }

        return Ok(escola);    
    }

}
