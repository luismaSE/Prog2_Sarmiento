package Parte2;

import Parte2.Clases.*;

import java.security.PublicKey;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {

        //ejercicio3();
        //ejercicio4();
        ejercicio5();
    }

    public static void ejercicio3() {
        System.out.println("\n\nEjercicio 3:");

        List<Integer> cola = new ArrayList<>();
        Productor prod = new Productor(cola, 3);
        Thread hProd = new Thread(prod);
        Consumidor cons1 = new Consumidor("UNO", cola);
        Consumidor cons2 = new Consumidor("DOS", cola);
        Consumidor cons3 = new Consumidor("TRES", cola);
        Thread hC1 = new Thread(cons1);
        Thread hC2 = new Thread(cons2);
        Thread hC3 = new Thread(cons3);

        hProd.start();
        hC1.start();
        hC2.start();
        hC3.start();

        try {
            hProd.join();
            System.out.println("terminó el prod");
            hC1.join();
            System.out.println("terminó el c1");
            hC2.join();
            System.out.println("terminó el c2");
            hC3.join();
            System.out.println("terminó el c3");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void ejercicio4() {
        System.out.println("\n\nEjercicio 4:");
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i = 0; i < 5; i++) {
            HiloCallable hc = new HiloCallable("hilo: "+i,50,100);
            executorService.submit(hc);
        }
        executorService.shutdown();
    }

    public static void ejercicio5() {
        System.out.println("\n\nEjercicio 5:");
        List<Integer> cola = new ArrayList<>();

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ProductorE5 hp = new ProductorE5(cola,5);
        executorService.submit(hp);

        for(int i = 0; i < 40; i++) {
            ConsumidorE5 hc = new ConsumidorE5(Integer.toString(i), cola);
            Future<Long> resultadoFuturo = executorService.submit(hc);
            Long resultado = null;
            try {
                resultado = resultadoFuturo.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            if (resultado > 30000000) {
                System.out.println("El resultado ("+resultado+") es mayor a 30.000.000");
            }
        }
        executorService.shutdown();
    }

}
