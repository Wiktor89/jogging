package com.example.jogging.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by VAfonin on 26.03.2018.
 */
@RestController
@RequestMapping(value = "/api")
public class MainController {

    private static final String ADD_USERS = "/add_users";

    @RequestMapping(value = MainController.ADD_USERS, method = RequestMethod.GET)
    public void test () {
        System.out.println ();
    }
}
