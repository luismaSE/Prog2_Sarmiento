package um.prog2.tp3e2.configuracion;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import um.prog2.tp3e2.entidad.Domicilio;
import um.prog2.tp3e2.servicio.DomicilioMemoriaService;


@Data
@Configuration
public class DomicilioConfiguration {

    private DomicilioMemoriaService domicilioMemoriaService;

    @Autowired
    public DomicilioConfiguration(DomicilioMemoriaService domicilioMemoriaService) {
        this.domicilioMemoriaService = domicilioMemoriaService;
        ejemplo1();
    }

    private void ejemplo1() {

        Domicilio domicilio1 = new Domicilio("0","San Martin",777, "Godoy Cruz","Mendoza");
        Domicilio domicilio2 = new Domicilio("1","Belgrano",333, "Ciudad","Mendoza");
        Domicilio domicilio3 = new Domicilio("2","Colón",555, "Ciudad","Mendoza");

        domicilioMemoriaService.add(domicilio1);
        domicilioMemoriaService.add(domicilio2);
        domicilioMemoriaService.add(domicilio3);

    }
}