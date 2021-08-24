package com.sb.jpa.dao;

import java.util.List;

import org.hibernate.type.TrueFalseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sb.jpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	public List<User> findByName(String name);
	
	public List<User> findByNameAndCity(String name,String city);
	
	public List<User> findByNameLike(String name);
	
	@Query("from User")
	public List<User> getAllUser();
	
	@Query("select u from User u where u.name=:n")
	public List<User> getAllUserName(@Param("n") String name);
	
	@Query(value="select * from user", nativeQuery = true)
	public List<User> getUsers();
	
	
	
}
