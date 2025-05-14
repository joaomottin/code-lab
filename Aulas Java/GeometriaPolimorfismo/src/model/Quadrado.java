package model;

public final class Quadrado extends Formas{
   private String cor;

   public Quadrado(float base, float altura, String cor) {
    super(base, altura);
    this.cor = cor;
   }

   public String getCor() {
    return cor;
   }

   public void setCor(String cor) {
    this.cor = cor;
   }

   @Override
   public float calcularArea() {
    return base * altura;
   }

   @Override
   public String toString() {
    return "Quadrado de cor=" + cor + " e área igual à= " + calcularArea();
   }

    
}
