/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evs.java.springmvc.class8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author shahzad
 */
@Controller
public class FirstController {

    @RequestMapping("/index.json")
    public ModelAndView index() {
       return new ModelAndView("index", 
               "first", 
               "This is Spring MVC Application") ;
    }
}
