package um.prog2.tp3e2.servicio;

import um.prog2.tp3e2.entidad.Persona;

import java.util.List;

public interface PersonaRepositorio {
    public Persona get(int codigo);
    public void add(Persona persona);
    public void remove(int codigo);
    public void remove(Persona p);
    public void put(int codigo, Persona p);
    public List<Persona> getAll();
}
