package Clases;

import java.util.*;
import Excepciones.EmpleadoException;

public class Empleado {
    public String nombre;
    public String apellido;
    public String legajo;
    public Integer aniosTrabajados;



    public Empleado() {}

    public Empleado(String nombre, String apellido, String legajo, int aniosTrabajados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.aniosTrabajados = aniosTrabajados;
    }



    @Override
    public String toString(){
        return("Nombre y apellido: "+nombre+" "+apellido+", Legajo: "+legajo+", Años trabajados: "+ aniosTrabajados);
    }

    public static Empleado crearEmpleado(String string) throws EmpleadoException {
        String[] datosList = string.split("\\s*,\\s*");
        Map<String, String> empleadoMap = new HashMap<>();
        for (String dato : datosList) {
            String[] atributo = dato.split("=");
            if (atributo.length != 2) {
                throw new EmpleadoException("Error: Todos los campos deben tener valor. Siguien el formato (clave=valor). Campo erroneo: " + dato);
            }
            empleadoMap.put(atributo[0].toLowerCase(), atributo[1]);
        }
        List<String> claves = Arrays.asList("nombre", "apellido", "legajo", "aniostrabajados");

        for (String clave : claves) {
            if (empleadoMap.get(clave) == null) {
                throw new EmpleadoException("Error, todos los campos son obligatorios. Falta el campo: " + clave);
            }
        }
        String nombre = empleadoMap.get("nombre");
        String apellido = empleadoMap.get("apellido");
        String legajo = empleadoMap.get("legajo");
        Integer aniostrabajados;
        try {
            aniostrabajados = Integer.parseInt(empleadoMap.get("aniostrabajados"));
        } catch (NumberFormatException e) {
            throw new EmpleadoException("Error: (" + e + ") el campo aniosTrabajados debe ser un número entero mayor a cero");
        }
        if (aniostrabajados <= 0) {
            throw new EmpleadoException("Error, el campo aniosTrabajados debe ser un número entero mayor a cero");
        }

        return new Empleado(nombre, apellido, legajo, aniostrabajados);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public Integer getAniosTrabajados() {
        return aniosTrabajados;
    }

    public void setAniosTrabajados(int aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }


}