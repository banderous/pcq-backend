package uk.gov.hmcts.reform.pcqbackend.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@Order(1)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers("/swagger-ui.html",
                                   "/webjars/springfox-swagger-ui/**",
                                   "/swagger-resources/**",
                                   "/health",
                                   "/health/liveness",
                                   "/pcq/backend/**",
                                   "/v2/api-docs/**",
                                   "/info",
                                   "/favicon.ico",
                                   "/");
    }
}