package ar.com.juanek;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Context {

    @Bean
    public Service service() {
        return new Service();
    }

}
