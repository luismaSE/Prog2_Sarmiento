package Parte2.Clases;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.Callable;

public class ProductorE5 implements Callable {

    private List<Integer> cola;
    private int capacidad;

    public ProductorE5(List<Integer> cola, int capacidad) {
        this.cola = cola;
        this.capacidad = capacidad;
    }

    public Void call() {
        Random rand = new Random();

        for (int i = 0; i < 40; i++) {
            int n = rand.nextInt(13) + 3;

            synchronized (cola) {
                while (cola.size() == capacidad) {
                    try {
                        cola.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                cola.add(n);
                System.out.println("Productor agrega " + n + " en la cola.");
                cola.notifyAll();
            }
        }
        return null;
    }
}