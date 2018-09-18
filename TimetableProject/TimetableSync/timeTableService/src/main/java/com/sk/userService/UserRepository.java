package com.sk.userService;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByIndex(String index);
}