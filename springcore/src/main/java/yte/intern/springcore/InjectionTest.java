package yte.intern.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class InjectionTest {
    private BeanTest beanTest;
    private ComponentTest componentTest;

    public InjectionTest(BeanTest beanTest, ComponentTest componentTest) {
        this.beanTest = beanTest;
        this.componentTest = componentTest;
    }

    pu

}
