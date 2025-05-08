using API.Modelos;

namespace Namespace;
public class Curso
{
    public int Id { get; set; }
    public string Name { get; set; }

    public int? EscolaId {get; set; } 
    public Escola? Escola { get; set; }
    
}
