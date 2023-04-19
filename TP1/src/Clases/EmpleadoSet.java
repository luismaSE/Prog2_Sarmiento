package Clases;

public class EmpleadoSet extends Empleado {

    public EmpleadoSet() {}

    public EmpleadoSet(String nombre, String apellido, String legajo, int aniosTrabajados) {
        super(nombre, apellido, legajo, aniosTrabajados);
    }



    @Override
    public boolean equals(Object object) {
        EmpleadoSet empleado = (EmpleadoSet) object;

        return (this.nombre.equals(empleado.nombre) &&
                this.apellido.equals(empleado.apellido) &&
                this.legajo.equals(empleado.legajo) &&
                this.aniosTrabajados.equals(empleado.aniosTrabajados));
    }


    @Override
    public int hashCode() {
        return  (this.nombre.hashCode() +
                this.apellido.hashCode() +
                this.aniosTrabajados.hashCode() +
                this.legajo.hashCode());
    }

}



