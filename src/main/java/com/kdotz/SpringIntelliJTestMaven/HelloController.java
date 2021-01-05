package com.kdotz.SpringIntelliJTestMaven;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class HelloController {

    @RequestMapping(value = "/hello_world", method = RequestMethod.GET)
    public String printHelloWorld(ModelMap modelMap) {
        // add attribute to load model map
        modelMap.addAttribute("message",
                "Hello Drew and Welcome to Spring MVC");

        return "hello_world";
    }
}
