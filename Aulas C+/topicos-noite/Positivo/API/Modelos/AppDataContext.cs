namespace Namespace;

using API.Modelos;
using Microsoft.EntityFrameworkCore;

public class AppDataContext : DbContext
{
    public DbSet<Curso> Cursos { get; set; }
    public DbSet<Escola> Escolas { get; set; }

    protected override void
    OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        optionsBuilder.UseSqlite("Data Source=app.db");
    }

    protected override void
    OnModelCreating(ModelBuilder modelBuilder)
    {
        modelBuilder.Entity<Escola>().HasData(
            new Escola() { Id = 1, Name = "Humanas"},
            new Escola() { Id = 2, Name = "Exatas"}
        );
    }

}
