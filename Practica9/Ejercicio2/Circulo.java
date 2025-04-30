
package com.mycompany.coloreados;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: Círculo\nRadio: " + radio;
    }
}


