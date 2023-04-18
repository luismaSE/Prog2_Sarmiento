import java.util.*;

import Clases.*;
import Clases.Ejercicio4.*;
import Clases.Ejercicio5.*;
import Interfaces.FiguraGeometrica;



public class Main {

    public static void ejercicio1() {
        System.out.println("\n\nEjercicio 1:");

        Set<Empleado> setEmpleados = new HashSet<>();
        setEmpleados.add(new Empleado("Juan", "Perez", 1, 5));
        setEmpleados.add(new Empleado("Luis", "Sarmiento", 2, 6));
        setEmpleados.add(new Empleado("Sofia", "Esquembre", 3, 3));
        setEmpleados.add(new Empleado("Luz", "Columna", 4, 5));
        setEmpleados.add(new Empleado("Juan", "Perez", 1, 5));

        for (Empleado empleado : setEmpleados) {
            System.out.println(empleado);
        }
        System.out.println("\n");

        Set<EmpleadoSet> setEmpleados2 = new HashSet<>();
        setEmpleados2.add(new EmpleadoSet("Juan", "Perez", 1, 5));
        setEmpleados2.add(new EmpleadoSet("Luis", "Sarmiento", 2, 6));
        setEmpleados2.add(new EmpleadoSet("Sofia", "Esquembre", 3, 3));
        setEmpleados2.add(new EmpleadoSet("Juan", "Perez", 1, 5));
        setEmpleados2.add(new EmpleadoSet("Luz", "Columna", 4, 5));


        for (EmpleadoSet empleado : setEmpleados2) {
            System.out.println(empleado);
        }

    }

    public static void ejercicio2() {
        System.out.println("\n\nEjercicio 2:");

        ListaGenerica<String> milista = new ListaGenerica<>();
        milista.agregar("Primer Elemento");
        milista.agregar("Segundo Elemento");
        milista.agregar("Tercer Elemento");
        milista.agregar("Cuarto Elemento");

        milista.agregarPrincipio("Elemento Cero");
        milista.agregarConIndice(2, "Elemento colado");

        System.out.println(milista.primerElemento());
        System.out.println(milista.obtenerConIndice(2));
        System.out.println(milista.ultimoElemento());

        milista.removerConIndice(2);

        System.out.println(milista.cantidadElementos());
        milista.desordenar();
        System.out.println(milista.devolverLista());
        milista.ordenar();
        System.out.println(milista.devolverLista());
    }

    public static void ejercicio3() {
        System.out.println("\n\nEjercicio 3:");

        ListaGenerica<String> milista = new ListaGenerica<>();
        milista.agregar("Primer Elemento");
        milista.agregar("Segundo Elemento");
        milista.agregar("Tercer Elemento");
        milista.agregar("Cuarto Elemento");

        try {
            milista.agregarConIndice(11, "Decimo elemento");
        } catch (IndexOutOfBoundsException error) {
            System.out.println("Error al agregar con indice: " + error.getMessage());
        }

        try {
            milista.obtenerConIndice(11);
        } catch (IndexOutOfBoundsException error) {
            System.out.println("Error al obtener con indice: " + error.getMessage());
        }

        try {
            milista.removerConIndice(11);
        } catch (IndexOutOfBoundsException error) {
            System.out.println("Error al remover con indice: " + error.getMessage());
        }


        ListaGenerica<String> listaVacia = new ListaGenerica<>();
        try {
            listaVacia.primerElemento();
        } catch (IllegalStateException error) {
            System.out.println("Error al obtener el primer elemento:" + error.getMessage());
        }

        try {
            listaVacia.ultimoElemento();
        } catch (IllegalStateException error) {
            System.out.println("Error al obtener el ultimo elemento:" + error.getMessage());
        }
    }

    public static void ejercicio4() {
        System.out.println("\n\nEjercicio 4:");

        List<FiguraGeometrica> listaFiguras = new ArrayList<FiguraGeometrica>();
        listaFiguras.add(new Circulo(3.3));
        listaFiguras.add(new Circulo(6.6));
        listaFiguras.add(new Triangulo(4, 4, 5.5));
        listaFiguras.add(new Rectangulo(5, 10));
        listaFiguras.add(new Triangulo(3.3, 5.5, 7.7));

        for (FiguraGeometrica figura : listaFiguras) {
            System.out.println(figura.toString());
            System.out.println("Perimetro: " + figura.calcularPerimetro());
            System.out.println("Superficie: " + figura.calcularSuperficie());
            System.out.println("\n");
        }
    }

    public static void ejercicio5() {
        System.out.println("\n\nEjercicio 5:");
        List<FiguraGeometrica> listaFiguras = new ArrayList<FiguraGeometrica>();
        try {
            new CirculoXY(-3, 0, 0);
        } catch (Exception error) {
            System.out.println("Error al crear el CirculoXY: " + error.getMessage());
        }

        try {
            new RectanguloXY(7, 0, -3, -5);
        } catch (Exception error) {
            System.out.println("Error al crear el RectanguloXY: " + error.getMessage());
        }

        try {
            new TrianguloXY(3, 5, -7, 0, -2);
        } catch (Exception error) {
            System.out.println("Error al crear el TrianguloXY: " + error.getMessage());
        }

        try {
            CirculoXY circulo = new CirculoXY(5, 0, 0);
            circulo.setX(5);
            circulo.setY(-5);
        } catch (Exception error) {
            System.out.println("Error al mover el circulo: " + error.getMessage());
        }

        try {
            RectanguloXY rectangulo = new RectanguloXY(5, 10, 3,3);
            rectangulo.setX(-5);
            rectangulo.setY(-5);
        } catch (Exception error) {
            System.out.println("Error al mover el rectangulo: " + error.getMessage());
        }
    }

    public static void ejercicio6(){
        System.out.println("\n\nEjercicio 6:");

        Set<Empleado> setEmpleados = new HashSet<>();
        setEmpleados.add(new Empleado("Juan", "Perez", 1, 5));
        setEmpleados.add(new Empleado("Luis", "Sarmiento", 2, 4));
        setEmpleados.add(new Empleado("Sofia", "Esquembre", 3, 3));
        setEmpleados.add(new Empleado("Luz", "Columna", 4, 5));
        setEmpleados.add(new Empleado("Lucca", "Stella", 5, 2));

        Map<String , Empleado> mapaEmpleado = new HashMap<>();
        for(Empleado empleado : setEmpleados) {
            mapaEmpleado.put(empleado.getApellido()+","+empleado.getNombre(),empleado);
        }

        for (String clave : mapaEmpleado.keySet()) {
            System.out.println( mapaEmpleado.get(clave) );
        }
    }

    public static void ejercicio7() {
        System.out.println("\n\nEjercicio 7:");

    }


    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
    }
}
