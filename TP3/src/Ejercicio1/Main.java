package Ejercicio1;

import Ejercicio1.Empleado;
import Ejercicio1.EmpleadoSet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Empleado> setEmpleados = new HashSet<>();
        setEmpleados.add(new Empleado("Juan", "Perez", 1, 5));
        setEmpleados.add(new Empleado("Luis", "Sarmiento", 2, 6));
        setEmpleados.add(new Empleado("Sofia", "Esquembre", 3, 3));
        setEmpleados.add(new Empleado("Luz", "Columna", 4, 5));
        setEmpleados.add(new Empleado("Juan", "Perez", 1, 5));

        for(Empleado empleado : setEmpleados){
            System.out.println(empleado);

        Set<EmpleadoSet> setEmpleados2 = new HashSet<>();
            setEmpleados2.add(new EmpleadoSet("Juan", "Perez", 1, 5));
            setEmpleados2.add(new EmpleadoSet("Luis", "Sarmiento", 2, 6));
            setEmpleados2.add(new EmpleadoSet("Sofia", "Esquembre", 3, 3));
            setEmpleados2.add(new EmpleadoSet("Luz", "Columna", 4, 5));
            setEmpleados2.add(new EmpleadoSet("Juan", "Perez", 1, 5));
        }



    }
}
