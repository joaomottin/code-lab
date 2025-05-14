package model;

public abstract class Formas {
    protected float base, altura;

    public Formas(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public abstract float calcularArea();

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Formas [base=" + base + ", altura=" + altura + "]";
    }
    
}
