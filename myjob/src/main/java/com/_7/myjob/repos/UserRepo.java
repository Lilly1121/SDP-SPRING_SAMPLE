package com._7.myjob.repos;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;

import com._7.myjob.models.Users;

public interface UserRepo extends JpaRepository<Users, Long> {

}
