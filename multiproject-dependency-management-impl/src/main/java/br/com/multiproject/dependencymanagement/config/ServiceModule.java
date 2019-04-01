package br.com.multiproject.dependencymanagement.config;

import br.com.multiproject.dependencymanagement.service.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceModule {
    @Bean
    public Service service() {
        return new Service();
    }
}