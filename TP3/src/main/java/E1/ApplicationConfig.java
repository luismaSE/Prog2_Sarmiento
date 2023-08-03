package E1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("E1")
public class ApplicationConfig {

    @Bean
    public Arranque arranque() {
        return new Arranque();
    }
}