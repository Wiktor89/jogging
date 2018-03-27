package com.example.jogging.dao;

import com.example.jogging.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by VAfonin on 27.03.2018.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
