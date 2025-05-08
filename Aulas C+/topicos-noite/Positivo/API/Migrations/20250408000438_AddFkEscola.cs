using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace API.Migrations
{
    /// <inheritdoc />
    public partial class AddFkEscola : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AlterColumn<string>(
                name: "Name",
                table: "Escolas",
                type: "TEXT",
                nullable: true,
                oldClrType: typeof(string),
                oldType: "TEXT");

            migrationBuilder.AddColumn<int>(
                name: "EscolaId",
                table: "Cursos",
                type: "INTEGER",
                nullable: true);

            migrationBuilder.CreateIndex(
                name: "IX_Cursos_EscolaId",
                table: "Cursos",
                column: "EscolaId");

            migrationBuilder.AddForeignKey(
                name: "FK_Cursos_Escolas_EscolaId",
                table: "Cursos",
                column: "EscolaId",
                principalTable: "Escolas",
                principalColumn: "Id");
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Cursos_Escolas_EscolaId",
                table: "Cursos");

            migrationBuilder.DropIndex(
                name: "IX_Cursos_EscolaId",
                table: "Cursos");

            migrationBuilder.DropColumn(
                name: "EscolaId",
                table: "Cursos");

            migrationBuilder.AlterColumn<string>(
                name: "Name",
                table: "Escolas",
                type: "TEXT",
                nullable: false,
                defaultValue: "",
                oldClrType: typeof(string),
                oldType: "TEXT",
                oldNullable: true);
        }
    }
}
