package com.example.jogging.service;

import com.example.jogging.models.User;

import java.util.List;

/**
 * Created by VAfonin on 27.03.2018.
 */
public interface UserService {

    User addUser (User user);

    void removeUser (Integer id);

    void updateUser (Integer id, User userDetails);

    User getUser (Integer id);

    List<User> getUsers ();
}
