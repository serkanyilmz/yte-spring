package yte.intern.springcore;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectionBean {
    public void print(){
        System.out.println("Ben bir SetterInjection");
    }
}
