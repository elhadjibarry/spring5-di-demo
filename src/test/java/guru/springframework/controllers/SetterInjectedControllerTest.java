package guru.springframework.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import guru.springframework.services.GreetingServiceImpl;

/**
 * @author Elhadji Barry (dur5268)
 */
public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void init() {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetinService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
    }
}
