package com.temelt.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages ={ "com.temelt.app.repo"})
@EntityScan(basePackages ={ "com.temelt.app"})
@EnableTransactionManagement
public class Application {
    public static void main(String[] args) throws Exception {
        new SpringApplication(Application.class).run(args);
    }
}
