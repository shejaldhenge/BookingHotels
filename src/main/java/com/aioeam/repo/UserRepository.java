package com.aioeam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aioeam.entity.UserInfo;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, String>{

}
