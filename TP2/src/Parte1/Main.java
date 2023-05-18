package Parte1;

import Parte1.Clases.Hilo1A;
import  Parte1.Clases.Hilo1B;
import  Parte1.Clases.Hilo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        //ejercicio1();
        ejercicio2();
    }

    public static void ejercicio1() {
        System.out.println("\n\nEjercicio 1:");

        Hilo1A hilo1 = new Hilo1A("Hilo_1");
        Hilo1A hilo2= new Hilo1A("Hilo_2");
        Hilo1A hilo3 = new Hilo1A("Hilo_3");
        Hilo1A hilo4 = new Hilo1A("Hilo_4");

        Hilo1B runable1 = new Hilo1B("Runable_1",10,700);
        Hilo1B runable2 = new Hilo1B("Runable_2",20,500);
        Hilo1B runable3 = new Hilo1B("Runable_3",30,50);
        Hilo1B runable4 = new Hilo1B("Runable_4",40,5);

        Thread h1 = new Thread(runable1);
        Thread h2 = new Thread(runable2);
        Thread h3 = new Thread(runable3);
        Thread h4 = new Thread(runable4);

        hilo1.start();
        h1.start();
        hilo2.start();
        h2.start();
        hilo3.start();
        h3.start();
        hilo4.start();
        h4.start();

    }


    public static void ejercicio2() {
        System.out.println("\n\nEjercicio 2:");
        List<Integer> lista1 = new ArrayList<Integer>();
        List<Integer> lista2 = new ArrayList<Integer>();

        Random rand = new Random();
        int min = 3;
        int max = 15;

        for (int i = 0; i < 40; i++) {
            int n = rand.nextInt((13)) + 3;
            lista1.add(n);
            lista2.add(n);

        }

        System.out.println("Lista mutable de números aleatorios:\n"+lista1+"\n");

        Hilo2 hiloSolo = new Hilo2("Hilo_Solitario", lista1);
        Thread hs = new Thread(hiloSolo);

        Hilo2 h1 = new Hilo2("Hilo_1", lista2);
        Hilo2 h2 = new Hilo2("Hilo_2", lista2);
        Hilo2 h3 = new Hilo2("Hilo_3", lista2);

        hs.start();

        h1.start();
        h2.start();
        h3.start();

    }
}

