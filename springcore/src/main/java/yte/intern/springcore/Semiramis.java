package yte.intern.springcore;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class Semiramis {

    public Semiramis() {
        System.out.println("Construct Semiramis");
    }
    public void print() {
        System.out.println("Printteyim");
    }

    @PostConstruct
    public void init() {
        System.out.println("Post Construct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Pre Destroy");
    }

}
