package Clases.Ejercicio5;

import Interfaces.FiguraGeometrica;

public class TrianguloXY implements FiguraGeometrica {
    private double lado1;
    private double lado2;
    private double lado3;
    private double x;
    private double y;

    public TrianguloXY(double lado1, double lado2, double lado3, double x, double y) throws Exception {
        if (lado1 < 0 || lado2 < 0 || lado3 < 0 || x < 0 || y < 0)
        { throw new Exception("Todos los valores deben ser positivos, revise los datos ingresados"); }

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.x = x;
        this.y = y;
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public double calcularSuperficie() {
        double s = calcularPerimetro() / 2;                                          // Siendo s = (l1+l2+l3)/2
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));               // usamos la formula A = raiz(s(s-l1)(s-l2)(s-l3))

    }

    public String toString() {
        return "TrianguloXY con lados: " + lado1 + ", " + lado2 + " , " + lado3;
    }


    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) throws Exception {
        if (x < 0) {
            throw new Exception("El valor de X debe ser positivo");
        }
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) throws Exception {
        if (y < 0) {
            throw new Exception("El valor de Y debe ser positivo");
        }
        this.y = y;
    }
}