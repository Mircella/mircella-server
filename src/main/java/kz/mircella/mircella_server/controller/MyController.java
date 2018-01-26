package kz.mircella.mircella_server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mircella")
public class MyController {

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ResponseBody
    public String say(ModelMap model){
        return "Hello from Mircella!";
    }
}
