package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") //로컬호스트에 처음 들어오면 나온다
    public String home(){
        return "home";
    }
}
