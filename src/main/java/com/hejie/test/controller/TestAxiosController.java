
package com.hejie.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.web.bind.annotation.RestController;

import com.hejie.test.dao.UserDao;
import com.hejie.test.dataObject.User;

/**
 * TestAxiosController
 */
@Controller
// @RestController 将
public class TestAxiosController {
    @Autowired
	UserDao userDao;
    
    @RequestMapping("/hejie/test")
    @ResponseBody
    public User test(@RequestBody User user){
        User newuser = userDao.showUser();
        return newuser;
    }
    @RequestMapping("/about")
    public String about() {
        return "about.html";
    }
    
}

