package com.example.repository;

import com.example.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sebas on 04/03/2017.
 */
public interface RolesRepository extends JpaRepository<Role, String> {
}
