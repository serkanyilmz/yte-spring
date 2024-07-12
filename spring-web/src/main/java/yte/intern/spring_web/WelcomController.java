package yte.intern.spring_web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomController {

    @RequestMapping("/courses/{no}")
    public void courses(
            @PathVariable String no,
            @RequestParam String testName,
            @RequestParam(required = false) String instructor) {
        System.out.println(no + testName  + instructor);
    }

}
