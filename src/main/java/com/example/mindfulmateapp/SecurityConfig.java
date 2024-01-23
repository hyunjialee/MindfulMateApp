//package com.example.mindfulmateapp;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
//@Configuration
//public class SecurityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {
//
////    @Override
////    public void configure(HttpSecurity http) throws Exception {
////        http
////                .authorizeRequests()
////                .antMatchers("/", "/api/users/register").permitAll()
////                .anyRequest().authenticated()
////                .and()
////                .formLogin()
////                .loginPage("/login")
////                .permitAll()
////                .and()
////                .logout()
//////                .permitAll();
//////    }
////    @Bean
////    public PasswordEncoder passwordEncoder() {
////        return new BCryptPasswordEncoder();
////    }
//}
