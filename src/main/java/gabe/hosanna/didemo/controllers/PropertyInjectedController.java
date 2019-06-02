package gabe.hosanna.didemo.controllers;

import gabe.hosanna.didemo.services.GreetingService;
import gabe.hosanna.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }

   /* public GreetingServiceImpl getGreetingService() {
        return greetingService;
    }*/
}
