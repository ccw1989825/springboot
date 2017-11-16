package com.ccwei.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ccwei.springboot.bean.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserName(String userName);
	
}
