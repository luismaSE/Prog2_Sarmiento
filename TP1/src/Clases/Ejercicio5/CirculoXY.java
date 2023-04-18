package Clases.Ejercicio5;

import Interfaces.FiguraGeometrica;

public class CirculoXY implements FiguraGeometrica {
    private double radio;
    private double x;
    private double y;


    public CirculoXY(double radio, double x, double y) throws Exception {
        if (radio < 0 || x < 0 || y < 0)
            { throw new Exception("Todos los valores deben ser positivos, revise los datos ingresados"); }
        this.radio = radio;
        this.x = x;
        this.y = y;
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


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
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
