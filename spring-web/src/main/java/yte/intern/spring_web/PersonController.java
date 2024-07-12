package yte.intern.spring_web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @RequestMapping("/person")
    public Person[] persons (@RequestBody Person[] persons){
        for (Person person : persons) {
            person.setAge(person.getAge() + 1);
        }
        return persons;
    }
}
