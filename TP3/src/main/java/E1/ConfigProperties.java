package E1;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@Data
@PropertySource("classpath:config.properties")
public class ConfigProperties {

    @Value("${e1.exponente}")
    private int exponenteD;


    @Value("${e1.raiz}")
    private int raizD;

}
