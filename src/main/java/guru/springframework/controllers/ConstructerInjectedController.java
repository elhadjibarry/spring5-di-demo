package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

/**
 * @author Elhadji Barry (dur5268)
 */
public class ConstructerInjectedController {

    private GreetingService greetinService;

    public ConstructerInjectedController(GreetingService greetinService) {
        this.greetinService = greetinService;
    }

    String sayHello() {
        return greetinService.sayGreeting();
    }


}
