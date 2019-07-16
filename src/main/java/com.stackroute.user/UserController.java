package com.stackroute.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
// set the url to /user in request mapping
@RequestMapping(value = "/", method= RequestMethod.GET)

// this method set the values from form to model
public String display(Model model){

    // create object of user class
    User user=new User();
    // set message
    user.setMessage("Welcome to stackroute ");

    // add attributes to model
    model.addAttribute("message",user.getMessage());
    // return user
    return "index";
}

}
