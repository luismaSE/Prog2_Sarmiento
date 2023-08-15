package um.prog2.tp3e2.servicio;

import ch.qos.logback.core.model.INamedModel;
import org.springframework.stereotype.Service;
import um.prog2.tp3e2.entidad.Domicilio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DomicilioMemoriaService implements DomicilioRepositorio {
    protected Map<String, Domicilio> domicilios;

    public DomicilioMemoriaService() {
        this.domicilios = new HashMap<>();
    }

    @Override
    public Domicilio get(String id) {
        Domicilio d = this.domicilios.get(id);
        return d;
    }

    @Override
    public void add(Domicilio d) {
        this.domicilios.put(d.getId(), d);
    }

    @Override
    public void remove(String id) {
        this.domicilios.remove(id);
    }

    @Override
    public void remove(Domicilio d) {
        this.domicilios.remove(d.getId());
    }

    @Override
    public void put(String id, Domicilio d) {
        Domicilio domicilio = this.domicilios.get(id);
        this.domicilios.remove(id);
        Domicilio domicilio2 =d;
        domicilio2.setId(id);
        this.domicilios.put(domicilio2.getId(), domicilio2);
    }

    @Override
    public List<Domicilio> getAll() {
        List<Domicilio> domicilios;
        domicilios = this.domicilios.values().stream().collect(Collectors.toCollection(ArrayList::new));
        return domicilios;
    }
}

