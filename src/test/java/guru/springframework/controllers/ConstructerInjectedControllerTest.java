package guru.springframework.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import guru.springframework.services.GreetingServiceImpl;

/**
 * @author Elhadji Barry (dur5268)
 */
public class ConstructerInjectedControllerTest {

    private ConstructerInjectedController constructerInjectedController;

    @Before
    public void init() {
        this.constructerInjectedController = new ConstructerInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructerInjectedController.sayHello());
    }
}
