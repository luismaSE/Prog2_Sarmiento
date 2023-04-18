package Clases;

public class Empleado {
    public String nombre;
    public String apellido;
    public Integer legajo;
    public Integer aniosTrabajados;



    public Empleado() {}

    public Empleado(String nombre, String apellido, int legajo, int aniosTrabajados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.aniosTrabajados = aniosTrabajados;
    }



    @Override
    public String toString(){
        return("Nombre y apellido: "+nombre+" "+apellido+", Legajo: "+legajo+", Años trabajados: "+ aniosTrabajados);
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

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Integer getAniosTrabajados() {
        return aniosTrabajados;
    }

    public void setAniosTrabajados(int aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }


}