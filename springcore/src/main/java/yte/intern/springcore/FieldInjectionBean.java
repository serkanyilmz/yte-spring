
package yte.intern.springcore;

import org.springframework.stereotype.Component;

@Component
public class FieldInjectionBean {
    public void print(){
        System.out.println("Ben bir FieldInjection");
    }
}
