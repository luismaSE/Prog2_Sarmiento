package Parte2.Clases;

import java.util.List;
import java.util.concurrent.Callable;

public class ConsumidorE5 implements Callable {

    protected String nombre;
    protected List<Integer> lista;

    public ConsumidorE5(String nombre, List<Integer> lista) {
        this.nombre = nombre;
        this.lista = lista;
    }

    public Long call() {
        long resultado = 0;
            synchronized (lista) {
                while (lista.isEmpty()) {
                    try {
                        lista.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int valor = lista.remove(0);
                resultado = factorial(valor);
                System.out.println("Hilo (" + nombre + ") procesando la lista. Valor a calcular (" + valor + "). Resultado: " + resultado);
                lista.notify(); // Notificar al productor
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        return resultado;
    }

    public  long factorial(Integer valor) {
        long resultado = 1;
        for (int i = 1; i <= valor; i++) {
            resultado *= i;
        }
        return resultado;

    }
}
