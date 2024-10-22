package com.DemoOnline.tiendaOnline.Configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnablewebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgConstruction
public class security {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)
    {
        return http
                .csrf ( csrf ->
                        csrf
                                .disable ())
                .authorizeHttpRequessts (authRequest ->
                        authRequest
                                .requestMatchers (...patterns:"/auth/**").permitAll()
                                .anyRequest().authenticated()
                                )
                .formLogin(withDefaults())
                .build();
    }
}
