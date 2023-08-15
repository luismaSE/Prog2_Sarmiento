package um.prog2.tp3e2.servicio;

import um.prog2.tp3e2.entidad.Domicilio;

import java.util.List;

public interface DomicilioRepositorio {
    public Domicilio get(String id);
    public void add (Domicilio domicilio);
    public void remove (String id);
    public void remove (Domicilio d);
    public void put (String id, Domicilio d);
    public List<Domicilio> getAll();

}
