package mvc.safe;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {


    @Override
    public void configure(HttpSecurity http) throws Exception {

        //【注意事项】放行资源要放在前面，认证的放在后面
        http.authorizeRequests()
                .mvcMatchers("/demo/dl").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()//表示其他需要认证的请求通过表单认证
                .loginPage("/demo/dl")//用来指定自定义登录界面，不使用SpringSecurity默认登录界面  注意：一旦自定义登录页面，必须指定登录url
                .loginProcessingUrl("/demo/dl")//指定处理登录的请求url
                .usernameParameter("username") //指定登录界面用户名文本框的name值，如果没有指定，默认属性名必须为username
                .passwordParameter("password")//指定登录界面密码密码框的name值，如果没有指定，默认属性名必须为password
                .defaultSuccessUrl("/demo/Home")//认证成功 之后跳转，重定向 redirect 跳转后，地址会发生改变  根据上一保存请求进行成功跳转
                .and()
                .csrf().disable(); //禁止csrf 跨站请求保护
    }
}