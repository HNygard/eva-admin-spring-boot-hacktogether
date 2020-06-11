package no.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@EntityScan(basePackages = {"no.valg", "no.evote"})  // scan JPA entities
@SpringBootApplication
@ComponentScan( {
        "no.valg", "no.evote", "no.app"
})
public class PostgresqlApplication {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "postgres");
        SpringApplication.run(PostgresqlApplication.class, args);
    }

}
