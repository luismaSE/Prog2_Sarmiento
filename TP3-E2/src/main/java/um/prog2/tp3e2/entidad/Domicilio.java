package um.prog2.tp3e2.entidad;

import lombok.Data;

@Data
public class Domicilio {
    protected  String id;
    protected String calle;
    protected int numero;
    protected  String localidad;
    protected String provincia;

    public Domicilio(String id, String calle, int numero, String localidad, String provincia) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
        this.provincia = provincia;
    }
}
