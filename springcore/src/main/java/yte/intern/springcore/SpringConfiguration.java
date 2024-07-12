package yte.intern.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public JavaBasedBean(final BeanTest beanTest) {
        return new JavaBasedBean(beanTest);
    }
}
