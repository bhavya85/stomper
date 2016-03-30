package org.stomper.service.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by i848785 on 3/29/16.
 */

@RestController
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
