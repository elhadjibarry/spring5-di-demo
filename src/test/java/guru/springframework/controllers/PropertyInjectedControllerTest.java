package guru.springframework.controllers;

import org.junit.Before;
import org.junit.Test;
import guru.springframework.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

/**
 * @author Elhadji Barry (dur5268)
 */
public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void init() {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
    }
}
