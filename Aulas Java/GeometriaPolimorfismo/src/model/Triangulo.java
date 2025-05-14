package model;

public final class Triangulo extends Formas{
    private String tipo;

    public Triangulo(float base, float altura, String tipo) {
        super(base, altura);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public float calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "Triangulo é do tipo=" + tipo + " e tem uma área total de " + calcularArea();
    }

    

}
