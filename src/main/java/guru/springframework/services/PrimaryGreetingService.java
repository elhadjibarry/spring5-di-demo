package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Elhadji Barry (dur5268)
 */
@Service
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingService implements GreetingService {


    @Override
    public String sayGreeting() {
        return "Hello! Primary Greeting Service";
    }
}
