package Clases.Ejercicio4;

import Interfaces.FiguraGeometrica;

public class Circulo implements FiguraGeometrica {
    private double radio;


    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularPerimetro() {
        return 2 * 3.14 * radio;
    }

    public double calcularSuperficie() {
        return 3.14 * radio * radio;
    }

    public String toString() {
        return "CirculoXY con radio = " + radio;
    }
}
