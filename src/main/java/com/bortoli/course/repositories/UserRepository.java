package com.bortoli.course.repositories;

import com.bortoli.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {


}