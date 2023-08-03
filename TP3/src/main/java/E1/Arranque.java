package E1;

import org.springframework.beans.factory.annotation.Autowired;

public class Arranque {

    @Autowired
    Servicio_E1 servicioE1;

    public void arranque() {
        System.out.println("E1.Arranque");

        System.out.println("5 elevado a 10 = "+this.servicioE1.calcularPotencia(5,10));
        System.out.println("5 elevado a 5 = "+this.servicioE1.calcularPotencia(5,5));
        System.out.println("5 elevado a 3 = "+this.servicioE1.calcularPotenciaD(5));
        System.out.println("7 elevado a 3 = "+this.servicioE1.calcularPotenciaD(7));

        System.out.println("raiz 6 de 10 = "+this.servicioE1.calcularRaiz(10,6));
        System.out.println("raiz 3 de 10 = "+this.servicioE1.calcularRaiz(10,3));
        System.out.println("raiz 2 de 10 = "+this.servicioE1.calcularRaizD(10));
        System.out.println("raiz 2 de 7 = "+this.servicioE1.calcularRaizD(7));

    }
}
