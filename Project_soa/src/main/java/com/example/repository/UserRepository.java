package com.example.repository;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer>{

	@Query("from Users u where u.user_username =:username and u.user_password =:password")
	public Users findByUserAndPass(@Param("username")String username, @Param("password")String password);
	
	@Query("from Users u where u.user_username =:name")
	public Users findByName(@Param("name")String name);
	
}