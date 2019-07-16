package com.stackroute.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
// set the url to /user in request mapping
@RequestMapping(value = "/user", method= RequestMethod.POST)

// this method set the values from form to model
public String display(@RequestParam("userName") String userName,
                      @RequestParam("userPassword") String userPassword, Model model){

    // create object of user class
    User user=new User();
    // set name from the form to model
    user.setUserName(userName.toString());
    // set password from the form to model
    user.setUserPassword(userPassword.toString());
    // set message
    user.setMessage("Welcome to stackroute ");

    // add attributes to model
    model.addAttribute("message",user.getMessage()+user.getUserName());
    // return user
    return "User";
}

}
