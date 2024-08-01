package com._7.myjob.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com._7.myjob.models.Users;
import com._7.myjob.repos.UserRepo;

@Service
public class UserServices {
  @Autowired
  private UserRepo ur;

  public List<Users> getUsers() {
    return ur.findAll();
  }

  public Users addUsers(Users user) {
    return ur.save(user);
  }

  public Users updateUser(Long id, Users user) {
    Optional<Users> optionalUser = ur.findById(id);
    if (optionalUser.isPresent()) {
      Users existingUser = optionalUser.get();
      existingUser.setName(user.getName()); // Example field update
      existingUser.setEmail(user.getEmail()); // Example field update
      // Add more fields as needed
      return ur.save(existingUser);
    }
    return null;
  }

}
