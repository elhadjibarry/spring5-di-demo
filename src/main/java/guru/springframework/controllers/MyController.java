package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import guru.springframework.services.GreetingService;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("Hello!!!");
        return greetingService.sayGreeting();
    }
}
