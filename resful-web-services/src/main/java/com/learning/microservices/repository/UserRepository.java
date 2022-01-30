package com.learning.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.microservices.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	
}
