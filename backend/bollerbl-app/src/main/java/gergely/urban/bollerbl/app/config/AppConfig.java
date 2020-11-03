package gergely.urban.bollerbl.app.config;

import gergely.urban.bollerbl.app.App;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAspectJAutoProxy
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "repositories")
public class AppConfig {
    @Bean
    public App app() {
        return new App();
    }
}

