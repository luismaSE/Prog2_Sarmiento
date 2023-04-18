package Clases.Ejercicio4;

import Interfaces.FiguraGeometrica;

public class Triangulo implements FiguraGeometrica {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    // usamos la formula A = raiz(s(s-l1)(s-l2)(s-l3))
    // Siendo s = (l1+l2+l3)/2
    public double calcularSuperficie() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    public String toString() {
        return "TrianguloXY con lados: " + lado1 + ", " + lado2 + " , " + lado3;
    }
}