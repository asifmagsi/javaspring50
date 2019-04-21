/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evs.java.springmvc.class8;

import evs.java.springmvc.class9.dao.UserDao;
import evs.java.springmvc.class9.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author shahzad
 */
@Controller
public class FirstController {
    
    @Autowired
    private UserDao userTemplate ;
    
    @RequestMapping("/index.htm")
    public ModelAndView index() {
       return new ModelAndView("index", 
               "first", 
               "This is Spring MVC Application") ;
    }
    
    @RequestMapping("/login.htm")
    public ModelAndView login(
            @RequestParam (name="login", required = true ) String username,
            @RequestParam (name="pass", required=true ) String userpass   
        ) {
        String message = "Invalid Combination..." ;
        User user = userTemplate.validate(username, userpass) ;
        if ( user == null ) {
            return index() ;
        }
        else {
            // valid user, move to home page
            return home() ;
        }
    }
    
    @RequestMapping("/home.htm")
    public ModelAndView home() {
       return new ModelAndView("home") ;
    }
    
}
