package com.example.jogging.controller;

import com.example.jogging.models.User;
import com.example.jogging.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by VAfonin on 26.03.2018.
 */
@RestController
@RequestMapping (value = Url.CONTROLLER_USER)
public class UserController {

    @Autowired
    private UserService service;

//    @Autowired
//    @Qualifier (value = "test")
    private JpaRepository testservice;

    @RequestMapping (value = Url.POST_USER, method = RequestMethod.POST)
    public User addUser (@RequestBody User user) {
        return service.addUser (user);
    }

    @RequestMapping (value = Url.DELETE_USER_BY_ID, method = RequestMethod.DELETE)
    public void removeUser (@PathVariable ("id") Integer id) {
        service.removeUser (id);
    }

    @RequestMapping (value = Url.PUT_USER_BY_ID, method = RequestMethod.PUT)
    public void updateUser (@RequestBody User user, @PathVariable ("id") Integer id) {
        service.updateUser (id, user);
    }

    @RequestMapping (value = Url.GET_USER_BY_ID, method = RequestMethod.GET)
    public User getUser (@PathVariable ("id") Integer id) {
        return service.getUser (id);
    }

    @RequestMapping (value = Url.GET_USERS, method = RequestMethod.GET)
    public List<User> getUsers () {
        return service.getUsers ();
    }

}
