package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * @author Elhadji Barry (dur5268)
 */
@Service
public class SetterGreetingService implements GreetingService {


    @Override
    public String sayGreeting() {
        return "Hello! I was injected via the setter";
    }
}
