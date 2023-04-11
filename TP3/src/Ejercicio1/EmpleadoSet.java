package Ejercicio1;

public class EmpleadoSet extends Empleado {

    public EmpleadoSet() {}

    public EmpleadoSet(String nombre, String apellido, int legajo, int aniosTrabajados) {
        super(nombre, apellido, legajo, aniosTrabajados);
    }



    @Override
    public Boolean equals(EmpleadoSet empleado) {
        if (empleado.nombre == this.nombre &&
            empleado.apellido == this.apellido &&
            empleado.legajo == this.legajo &&
            empleado.aniosTrabajados == this.aniosTrabajados) {return true;}
        else {return false;}

    }

}




