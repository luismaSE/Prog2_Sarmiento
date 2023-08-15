package um.prog2.tp3e2.configuracion;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import um.prog2.tp3e2.entidad.Persona;

@Data
@Configuration
@ConfigurationProperties(prefix = "luisma", ignoreUnknownFields = true)
public class PersonaConfiguration {
    protected String url;
    protected String puerto;
    protected Persona pers;

}