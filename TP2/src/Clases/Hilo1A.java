package Clases;

import java.util.Random;


public class Hilo1A extends Thread {
    protected String nombre;

    public Hilo1A(String nombre) {
        this.nombre = nombre;
    }

    public  void run() {
        Random random = new Random();
        Integer iteracion = random.nextInt(31) + 10;
        Integer demora = random.nextInt(950) + 50;
        System.out.println("Soy el Hilo ("+this.nombre+")\nCantidad de iteraciones: "+iteracion+"\n Tiempo de demora: "+demora+"\n");
        for (int i = 0 ;  i < iteracion ; i++ ) {

            System.out.println("Este es el hilo ("+ this.nombre +") y esta es la iteración "+ i);
            try {
                Thread.sleep(demora);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
