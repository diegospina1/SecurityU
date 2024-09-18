package co.edu.ue.eight_project.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.List;

@Configuration
@EnableWebSecurity
public class SecurityConfigurations {

    @Bean
    public InMemoryUserDetailsManager userManager() {
        List<UserDetails> users = List.of(
                User.withUsername("userWeb")
                        .password("{noop}1234")
                        .roles("ADMIN")
                        .build(),

                User.withUsername("userOther")
                        .password("{noop}1234")
                        .roles("OTHER")
                        .build(),

                User.withUsername("userApp")
                        .password("{noop}2345")
                        .roles("USERS")
                        .build()
        );
        return new InMemoryUserDetailsManager(users);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(cus -> cus.disable())
                .authorizeHttpRequests(auth -> auth.requestMatchers(HttpMethod.POST, "/usuario").hasAnyRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/usuario/listar-todos").authenticated()
                        .requestMatchers(HttpMethod.GET, "/usuario/listar/{id}").authenticated())
                .httpBasic(Customizer.withDefaults());
        return http.build();

    }


}
