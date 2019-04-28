/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evs.java.springmvc.class8;

import evs.java.springmvc.class9.dao.UserDao;
import evs.java.springmvc.class9.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author shahzad
 */
@Controller
public class FirstController {

    @Autowired
    private UserDao userTemplate;

    @RequestMapping("/index.htm")
    public ModelAndView index() {
        return new ModelAndView("index",
                "first",
                "This is Spring MVC Application");
    }

    // Class 9
    @RequestMapping("/login.htm")
    public ModelAndView login(
            @RequestParam(name = "login", required = true) String username,
            @RequestParam(name = "pass", required = true) String userpass
    ) {
        String message = "Invalid Combination...";
        User user = userTemplate.validate(username, userpass);
        if (user == null) {
            return index();
        } else {
            // valid user, move to home page
            return home("User Logged in Successfully", null);
        }
    }

    @RequestMapping("/home.htm")
    public ModelAndView home(
            @RequestParam(name = "pass", required = false) String pass,
            @RequestParam(name = "fail", required = false) String fail
    ) {
        Map<String, Object> map
                = new HashMap<String, Object>();

        List<User> all = userTemplate.all();
        map.put("all", all);
        // TODO: Message Placeholder
        if (pass != null) {
            map.put("pass", pass);
        }
        if (fail != null) {
            map.put("fail", fail);
        }
        return new ModelAndView("home", "map", map);
    }

    @RequestMapping(value = {"/useradd.htm"}, method = {RequestMethod.GET})
    public ModelAndView useraddget() {
        Map<String, Object> map
                = new HashMap<String, Object>();
        // TODO: Message Placeholder
        map.put("pass", "success");
        map.put("fail", "unsuccess");
        return new ModelAndView("useradd", "map", map);
    }

    @RequestMapping(value = {"/useradd.htm"}, method = {RequestMethod.POST})
    public ModelAndView useraddpost(
            @RequestParam(value = "name", required = true) String name,
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "phone", required = false) String phone,
            @RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "userpass", required = true) String userpass
    ) {
        // TODO: Security
        boolean insert = userTemplate.create(
                new User(0, name, email, phone,
                        1, username, userpass));
        String pass = null, fail = null;
        if (insert) {
            // Success
            pass = "User inserted successfully ... ";
        } else {
            // Failure
            fail = "Unable to insert user ... ";
        }
        return home(pass, fail);
    }

    @RequestMapping(value = {"/userupd.htm"}, method = {RequestMethod.GET})
    public ModelAndView userupdget(
            @RequestParam(value = "id", required = true) String id
    ) {
        Map<String, Object> map
                = new HashMap<String, Object>();
        User user = userTemplate.get(Integer.parseInt(id));
        map.put("user", user);
        // TODO: Message Placeholder
        map.put("pass", "success");
        map.put("fail", "unsuccess");
        return new ModelAndView("userupd", "map", map);
    }

    @RequestMapping(value = {"/userupd.htm"}, method = {RequestMethod.POST})
    public ModelAndView userupdpost(
            @RequestParam(value = "id", required = true) String id,
            @RequestParam(value = "name", required = true) String name,
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "phone", required = false) String phone,
            @RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "userpass", required = true) String userpass
    ) {
        Map<String, Object> map
                = new HashMap<String, Object>();
        boolean update = userTemplate.update(
                new User(Integer.parseInt(id), name,
                        email, phone, 1, username, userpass));
        return home(update ? "User updated Successfully" : null,
                update == false ? "Unable to update user" : null);
    }

    @RequestMapping("/userdel.htm")
    public ModelAndView userdel(
            @RequestParam(name = "id") String id
    ) {
        User u = userTemplate.delete(Integer.parseInt(id));
        return home(u != null ? "User Deleted Successfully" : null,
                u == null ? "Unable to delete user" : null);
    }
}
