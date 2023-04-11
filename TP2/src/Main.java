/*
Ejercicio 1
Crear una clase Persona con atributos nombre, apellido y edad.
Crear una lista del tipo String y almacenar 5 nombres.
Crear una lista del tipo String y almacenar 5 apellidos.
Crear una lista de Personas y agregar 5 personas, donde el nombre y apellido corresponde a la posición 1 a 5 de las listas de nombre y apellido, y la edad es un número aleatorio entre 20 y 50 años.
Reescribir el método toString() de la clase Persona para que muestre los datos formateados
Mostrar la lista de personas
Iterar sobre la lista de personas y buscar la persona más grande y mostrarla por pantalla.
*/


import clases.Persona;
import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Luisma");
        listaNombres.add("Tincho");
        listaNombres.add("Facu");
        listaNombres.add("Sofi");
        listaNombres.add("Lucca");

        List <String> listaApellidos = new ArrayList<>();
        listaApellidos.add("Sarmiento");
        listaApellidos.add("Reyes");
        listaApellidos.add("Guarnier");
        listaApellidos.add("Esquembre");
        listaApellidos.add("Stella");

        List<Persona> listaPersonas = new ArrayList<>();
        for(int i = 0 ; i < 5 ; i++){
            int edad = ThreadLocalRandom.current().nextInt(20, 50 + 1);
            Persona persona = new Persona(listaNombres.get(i),listaApellidos.get(i),edad);
            listaPersonas.add(persona);};


        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        };

        Persona personaMasGrande = listaPersonas.get(0);
        for( Persona persona : listaPersonas) {
            if (persona.getEdad() > personaMasGrande.getEdad()) {
                personaMasGrande = persona;
            }

        }

        System.out.println("\nLa persona más grande es: "+personaMasGrande);

        }



    }