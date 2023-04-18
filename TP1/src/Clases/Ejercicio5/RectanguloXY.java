package Clases.Ejercicio5;

import Interfaces.FiguraGeometrica;

public class RectanguloXY implements FiguraGeometrica {
    private double base;
    private double altura;
    private  double x;
    private double y;

    public RectanguloXY(double base, double altura, double x, double y) throws Exception {
        if (base < 0 || altura < 0 || x < 0 || y < 0)
        { throw new Exception("Todos los valores deben ser positivos, revise los datos ingresados"); }

        this.base = base;
        this.altura = altura;
        this.x = x;
        this.y = y;
    }

    public double calcularPerimetro() {
        return 2 * base + 2 * altura;
    }

    public double calcularSuperficie() {
        return base * altura;
    }

    public String toString() {
        return "RectanguloXY con: base = " + base + " y altura = " + altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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
