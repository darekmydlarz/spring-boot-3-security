package pl.sztukakodu.springboot3security;

import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
class SecurityConfig {

    @Bean
    @SneakyThrows
    public SecurityFilterChain filterChain(HttpSecurity http) {
        http.authorizeHttpRequests(authz ->
            authz.requestMatchers(HttpMethod.GET, "/postings/vip")
                .hasRole("ROLE_ADMIN")
                .requestMatchers("/**")
                .permitAll()
        );
        return http.build();
    }
}
