package com.example.jogging.service;

import com.example.jogging.dao.UserRepository;
import com.example.jogging.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by VAfonin on 27.03.2018.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User addUser (User user) {
        return repository.save (user);
    }

    @Override
    public void removeUser (Integer id) {
        repository.deleteById (id);
    }

    @Override
    public void updateUser (Integer id, User userDetails) {
        User user  = repository.findById (id).orElseGet (User::new);
        user.setLoggin (userDetails.getLoggin ());
        user.setPassword (userDetails.getPassword ());
        user.setJoogingList (userDetails.getJoogingList ());
        repository.save (user);
    }

    @Override
    public User getUser (Integer id) {
        return repository.findById (id).get();
    }

    @Override
    public List<User> getUsers () {
        return repository.findAll ();
    }
}
