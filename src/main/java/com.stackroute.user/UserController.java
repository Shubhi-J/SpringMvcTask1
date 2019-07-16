package com.stackroute.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
@RequestMapping(value = "/user", method= RequestMethod.GET)
public String display(Model model){
    User user=new User();
    user.setMessage("Welcome to stackroute");

    model.addAttribute("message",user.getMessage());
    return "User";
}

}
