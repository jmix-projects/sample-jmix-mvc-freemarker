package com.company.mvcfreemarker.configuration;

import io.jmix.security.StandardSecurityConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends StandardSecurityConfiguration {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/portal/**").authenticated()
                .and()
                .formLogin().successForwardUrl("/portal/users");
        super.configure(http);
    }
}
