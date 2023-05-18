package Parte2.Clases;

import java.util.Random;
import java.util.concurrent.Callable;

public class HiloCallable implements Callable {
    protected String nombre;
    protected Integer iteracion;
    protected Integer demora;
    private Random random = new Random();

    public HiloCallable(String nombre, Integer iteracion, Integer demora) {
        this.nombre = nombre;
        this.iteracion = iteracion;
        this.demora = demora;
    }

    @Override
    public  Void call() {
        System.out.println("Soy el Hilo ("+nombre+")\nCantidad de iteraciones: "+iteracion+"\n Tiempo de demora: "+demora+"\n");
        for (int i = 0 ;  i < iteracion ; i++ ) {

            System.out.println("Este es el hilo ("+ nombre +") y esta es la iteración "+ i);
            try {
                Thread.sleep(demora);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}

