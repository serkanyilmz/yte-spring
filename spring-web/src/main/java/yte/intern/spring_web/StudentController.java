package yte.intern.spring_web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student student(){
        return new Student("Serkan", 14 , "serkan@gmail.com");
    }
}
