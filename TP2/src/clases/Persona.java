package clases;

/*Crear una clase Persona con atributos nombre, apellido y edad.*/

public class Persona {
public String nombre;
public String apellido;
public Integer edad;

    public Persona() {}

    public Persona(String nombre, String apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return (String.format("%s %s tiene %d años",this.nombre,this.apellido,this.edad));
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
