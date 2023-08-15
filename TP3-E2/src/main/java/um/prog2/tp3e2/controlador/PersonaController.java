package um.prog2.tp3e2.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import um.prog2.tp3e2.entidad.Persona;
import um.prog2.tp3e2.servicio.PersonaRepositorio;

import java.util.List;

@RestController
@RequestMapping("/persona/")
public class PersonaController {

    @Autowired
    PersonaRepositorio personas;

    @GetMapping("/{codigo}")
    public Persona get(@PathVariable int codigo) {
        Persona p = this.personas.get(codigo);
        return p;
    }

    @GetMapping
    public List<Persona> getAll() {
        List<Persona> personas = this.personas.getAll();
        return personas;
    }

    @PostMapping
    public Persona post(@RequestBody Persona persona) {
        this.personas.add(persona);
        return persona;
    }

    @DeleteMapping("/{codigo}")
    public String delete(@PathVariable int codigo) {
        if (this.personas.get(codigo) != null) {

            this.personas.remove(codigo);
            return ("Usuario eliminado");
        } else {
            return ("Código inexistente");
        }
    }

    @DeleteMapping
    public String delete(@RequestBody Persona persona) {
        this.personas.remove(persona);
        return ("Usuario eliminado");

    }

    @PutMapping("/{codigo}")
    public String put(@PathVariable int codigo, @RequestBody Persona persona) {
        if (this.personas.get(codigo) != null) {
            this.personas.put(codigo, persona);
            return ("Usuario modificado");
        } else {
            return ("Código inexistente");
        }
    }
}