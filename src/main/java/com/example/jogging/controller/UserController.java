package com.example.jogging.controller;

import com.example.jogging.models.User;
import org.springframework.web.bind.annotation.*;

/**
 * Created by VAfonin on 26.03.2018.
 */
@RestController
@RequestMapping(value = Url.CONTROLLER_USER)
public class UserController {

    @RequestMapping(value = Url.POST_USER, method = RequestMethod.GET)
    public User addUser(@RequestBody User user) {
        return user;
    }

    @RequestMapping(value = Url.DELETE_USER_BY_ID, method = RequestMethod.DELETE)
    public void removeUser(@PathVariable("id") Integer id) {
        System.out.println ();
    }

    @RequestMapping(value = Url.PUT_USER_BY_ID, method = RequestMethod.PUT)
    public void updateUser(@RequestBody User user, @PathVariable("id") Integer id) {
        System.out.println ();
    }

    @RequestMapping(value = Url.GET_USER_BY_ID, method = RequestMethod.GET)
    public User getUser(@PathVariable("id") Integer id) {
        return null;
    }

    @RequestMapping(value = Url.GET_USERS, method = RequestMethod.GET)
    public User getUsers() {
        return null;
    }
}
