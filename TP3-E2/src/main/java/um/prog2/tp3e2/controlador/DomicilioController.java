package um.prog2.tp3e2.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import um.prog2.tp3e2.entidad.Domicilio;
import um.prog2.tp3e2.servicio.DomicilioRepositorio;
import java.util.List;

@RestController
@RequestMapping("/domicilio/")
public class DomicilioController {

    @Autowired
    DomicilioRepositorio domicilios;

    @GetMapping("/{id}")
    public Domicilio get(@PathVariable String id) {
        Domicilio d = this.domicilios.get(id);
        return d;
    }

    @GetMapping
    public List<Domicilio> getAll() {
        List<Domicilio> domicilios = this.domicilios.getAll();
        return domicilios;
    }

    @PostMapping
    public Domicilio post(@RequestBody Domicilio domicilio) {
        this.domicilios.add(domicilio);
        return domicilio;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) {
        if (this.domicilios.get(id) != null) {
            this.domicilios.remove(id);
            return ("Domicilo eliminado");
        } else {
            return ("Código inexistente");
        }
    }

    @DeleteMapping
    public String delete(@RequestBody Domicilio domicilio) {
        this.domicilios.remove(domicilio);
        return ("Domicilo eliminado");
    }

    @PutMapping("/{id}")
    public String put(@PathVariable String id,@RequestBody Domicilio domicilio) {
        if (this.domicilios.get(id) != null) {
            this.domicilios.put(id, domicilio);
            return ("Domicilio modificado");
        } else {
            return ("Código inexistente");
        }

    }
}