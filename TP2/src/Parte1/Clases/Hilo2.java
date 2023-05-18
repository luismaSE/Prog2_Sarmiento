package Parte1.Clases;

import java.util.List;

public class Hilo2 extends Thread {
    protected String nombre;
    protected List<Integer> lista;

    public Hilo2(String nombre, List<Integer> lista) {
        this.nombre = nombre;
        this.lista = lista;
    }

    public void run() {
        while (!lista.isEmpty()) {
            int valor = lista.remove(0);
            long resultado = factorial(valor);
            System.out.println("Hilo ("+nombre+") procesando la lista. Valor a calcular ("+valor+"). Resultado: "+resultado+".\nQuedan "+lista.size()+" elementos en la lista por procesar.");
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
