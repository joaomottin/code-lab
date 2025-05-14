package view;

import model.Circulo;
import model.Quadrado;
import model.Triangulo;

public abstract class FormasView {
    public static void main(String[] args){
    Circulo circulo = new Circulo(0, 0, 20);
    Quadrado quadrado = new Quadrado(5, 5, "Azul");
    Triangulo triangulo = new Triangulo(10, 10, "Equilátero");

        System.out.println("Área do Círculo: " +circulo.calcularArea());
        System.out.println("Área do Quadrado: " + quadrado.calcularArea());
        System.out.println("Área do Triângulo: " + triangulo.calcularArea());
    }
}
