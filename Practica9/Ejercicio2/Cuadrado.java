
package com.mycompany.coloreados;

public class Cuadrado extends Figura implements Coloreado {
    private double lado;

    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return lado * 4;
    }

    @Override
    public String comoColorear() {
        return "Colorear los cuatro lados";
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: Cuadrado\nLado: " + lado;
    }
}
