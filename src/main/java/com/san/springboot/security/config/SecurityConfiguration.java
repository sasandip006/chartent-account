package com.san.springboot.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.san.springboot.service.UserDetilsService;

@Configuration
@EnableWebSecurity
//@EnableMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class SecurityConfiguration {

    @Autowired
    private UserDetilsService detilsService;
    
//    @Autowired
//    private HandlerMappingIntrospector interceptor;

    @Bean
    public UserDetailsService detailsService() {
        return detilsService;
    }

//    @Bean UserDetailsService
    @SuppressWarnings("removal")
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeHttpRequests(
                (requests) -> requests
                        .requestMatchers(new AntPathRequestMatcher("/bypass/newuser")).permitAll()
                        .requestMatchers(new AntPathRequestMatcher("/bypass/welcome")).permitAll()
                        // .requestMatchers("/bypass/", "/bypass/newuser").permitAll()
                // .requestMatchers(new MvcRequestMatcher(interceptor, "/welcome")).permitAll()
                // .requestMatchers(new AntPathRequestMatcher("bypass/**")).permitAll()
                // .requestMatchers(new AntPathRequestMatcher("bypass/newUser")).permitAll()
                // .anyRequest()
                        .requestMatchers(new AntPathRequestMatcher("/ca/**")).authenticated()
        ).formLogin(
        // (form) -> form.loginPage("/login").permitAll() //if custom login page
        ).and() // if formLogin is empty param
                .logout((logout) -> logout.permitAll());
        return http.build();

//        return http.csrf().disable().authorizeHttpRequests().requestMatchers("/greet").permitAll().and()
//                .authorizeHttpRequests().requestMatchers("/name", "/ca/**").authenticated().and().formLogin().and()
//                .build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(detailsService());
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }

}
