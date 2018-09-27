package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import guru.springframework.services.GreetingService;

/**
 * @author Elhadji Barry (dur5268)
 */
@Controller
public class ConstructerInjectedController {

    private GreetingService greetingService;

    public ConstructerInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }


}
