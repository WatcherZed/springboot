package com.example.demo.test.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 覆盖自动配置的显式安全配置
 */
//声明该类是一个配置类
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {



    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //要求登录者拥有Reader角色
        http.authorizeRequests().antMatchers("/").access("hasRole('READER')")
                //登录者可以是任意角色
                .antMatchers("/***").permitAll()
                .and()
                .formLogin()
                //自定义配置登录表单路径
                .loginPage("/login")
                //登录失败时返回的路径
                .failureForwardUrl("/login?error=true");
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth)  {
    }
}
