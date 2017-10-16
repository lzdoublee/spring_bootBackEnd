package soccerSystemDemo.Security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

/**
 * Created by L.z Double E on 10/16/2017.
 */
@Configuration
public class SecurityConfig {

    protected void configure(AuthenticationManagerBuilder amb) throws Exception
    {
        amb.inMemoryAuthentication().withUser("user").password("password")
                .roles("USER").and().withUser("help").password("please").roles("ADMIN");
    }

    protected void configure(HttpSecurity httpSecurity) throws Exception
    {
        httpSecurity.httpBasic().and().authorizeRequests().antMatchers("/soccer/**")
                .hasRole("USER").and().csrf().disable().headers().frameOptions().disable();
    }

}
