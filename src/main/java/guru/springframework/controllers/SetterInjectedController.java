package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;

/**
 * @author Elhadji Barry (dur5268)
 */
public class SetterInjectedController {

    private GreetingService greetinService;

    String sayHello() {
        return greetinService.sayGreeting();
    }

    public void setGreetinService(GreetingService greetinService) {
        this.greetinService = greetinService;
    }
}
