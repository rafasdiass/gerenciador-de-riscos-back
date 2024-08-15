//package com.example.gerenciador.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Bean
//public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//    http
//            .cors().and() // Habilitar CORS conforme necessário
//            .csrf().disable() // Desabilitar CSRF, se não for necessário
//            .authorizeHttpRequests(auth -> auth
//                    .anyRequest().permitAll()); // Permite qualquer requisição sem autenticação
//
//    return http.build();
//}
