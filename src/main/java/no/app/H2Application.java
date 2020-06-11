package no.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan(basePackages = {"no.valg", "no.evote"})  // scan JPA entities
@SpringBootApplication
/*@EnableAutoConfiguration(exclude = {
        JndiConnectionFactoryAutoConfiguration.class,
        DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class,
        JpaRepositoriesAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class})
*/

@ComponentScan( {
        "no.valg", "no.evote"
})
public class H2Application {

    public static void main(String[] args) {
        SpringApplication.run(H2Application.class, args);
    }

}
