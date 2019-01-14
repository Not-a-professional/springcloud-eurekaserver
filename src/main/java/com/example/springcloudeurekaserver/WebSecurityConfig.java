package com.example.springcloudeurekaserver;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private final static BCryptPasswordEncoder ENCODER = new BCryptPasswordEncoder();

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable(); //关闭CSRF保护
        http.authorizeRequests().anyRequest().authenticated().and().httpBasic(); //基于httpBasic方式进行安全验证
    }

    //在内存中增加注册服务的权限验证
    @Override
    protected void configure(AuthenticationManagerBuilder auth)throws Exception {
        auth.inMemoryAuthentication()
                .withUser("liwei")
                .password(ENCODER.encode("wwwliwei001com"))
                .roles("ADMIN")
                //SpringSecurity5.0.x版本开始必须对密码进行加密，因此需要调用下面的方法
                .and().passwordEncoder(ENCODER);
    }
}
