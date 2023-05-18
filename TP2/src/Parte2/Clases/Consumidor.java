package Parte2.Clases;

import java.util.List;
import java.util.Queue;

public class Consumidor implements Runnable {

    protected String nombre;
    protected List<Integer> lista;

    public Consumidor(String nombre, List<Integer> lista) {
        this.nombre = nombre;
        this.lista = lista;
    }

    public void run() {
        long timeout = 1000;
        long elapsedTime = 0;
        boolean ejecucion = true;

        while (ejecucion) {
            synchronized (lista) {
                while (lista.isEmpty()) {
                    try {
                        long startTime = System.currentTimeMillis();
                        lista.wait(timeout);
                        elapsedTime = System.currentTimeMillis() - startTime;
                        if (elapsedTime >= timeout) {break;}
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (elapsedTime < timeout) {
                    int valor = lista.remove(0);
                    long resultado = factorial(valor);
                    System.out.println("Hilo (" + nombre + ") procesando la lista. Valor a calcular (" + valor + "). Resultado: " + resultado);
                    lista.notify(); // Notificar al productor
                }
                else {
                    break;
                }
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }




    public  long factorial(Integer valor) {
        long resultado = 1;
        for (int i = 1; i <= valor; i++) {
            resultado *= i;
        }
        return resultado;

    }
}
