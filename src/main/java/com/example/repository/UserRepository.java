package com.example.repository;

import com.example.model.Beer;
import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sebas on 04/03/2017.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
