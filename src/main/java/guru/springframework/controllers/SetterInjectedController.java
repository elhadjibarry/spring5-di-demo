package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;

/**
 * @author Elhadji Barry (dur5268)
 */
@Controller
public class SetterInjectedController {


    private GreetingService greetinService;

    public String sayHello() {
        return greetinService.sayGreeting();
    }

    @Autowired
    @Qualifier("setterGreetingService")
    public void setGreetinService(GreetingService greetinService) {
        this.greetinService = greetinService;
    }
}
