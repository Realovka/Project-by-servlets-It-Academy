package by.realovka.web.app.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScan({"by.realovka.web.app", "by.realovka.web.dao", "by.realovka.web.service"})
@EnableWebMvc
@EnableAspectJAutoProxy
@PropertySource("classpath:application.properties")
@EnableJpaRepositories(basePackages = "by.realovka.web.dao.repository",
        entityManagerFactoryRef = "factory",
        transactionManagerRef = "jpaTransactionManager")
public class ApplicationConfig {

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver(@Autowired ApplicationContext applicationContext) {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }






}
