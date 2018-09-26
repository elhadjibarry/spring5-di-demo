package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;

/**
 * @author Elhadji Barry (dur5268)
 */
public class PropertyInjectedController {

    public GreetingServiceImpl greetinService;

    String sayHello() {
        return greetinService.sayGreeting();
    }

}
