package com.owt.boatapp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(bCryptPasswordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.sessionManagement().
                sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        // Connection
        http.authorizeRequests().antMatchers("/login").permitAll();
        // List all boats
        http.authorizeRequests().antMatchers("/api/all/**").permitAll();
        // Get boat by Id
        http.authorizeRequests().antMatchers(HttpMethod.GET,"/api/**").permitAll();
        // Add boat
        http.authorizeRequests().antMatchers(HttpMethod.POST,"/api/**").permitAll();
        // Update boat by Id
        http.authorizeRequests().antMatchers(HttpMethod.PUT,"/api/**").permitAll();
        // Delete boat
        http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/api/**").permitAll();

        http.authorizeRequests().anyRequest().authenticated();
        //http.addFilter(new  JWTAuthenticationFilter (authenticationManager())) ;
        http.addFilterBefore(new JWTAuthorizationFilter(),UsernamePasswordAuthenticationFilter.class);
    }
}
