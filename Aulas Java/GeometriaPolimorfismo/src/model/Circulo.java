package model;

public final class Circulo extends Formas{
    private float circunferencia;

    public Circulo(float base, float altura, float circunferencia) {
        super(0,0);
        this.circunferencia = circunferencia;
    }

    public float getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(float circunferencia) {
        this.circunferencia = circunferencia;
    }

    @Override
    public float calcularArea() {
        float pi = 3.14f;
        float raio = circunferencia / (2 * pi);
        return pi * raio * raio; 
    }

    @Override
    public String toString() {
        return "Circulo [circunferencia=" + circunferencia + "]";
    }

    
}
