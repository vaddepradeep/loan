package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.dao.UserDao;

public interface UserRepo extends JpaRepository<UserDao, Integer> {
	@Query("select u.salary from UserDao u where u.userid =?1")
	public int SalaryCheck(int id);
	

}
