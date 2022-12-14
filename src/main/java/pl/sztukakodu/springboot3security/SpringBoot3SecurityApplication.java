package pl.sztukakodu.springboot3security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class SpringBoot3SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot3SecurityApplication.class, args);
    }

}
