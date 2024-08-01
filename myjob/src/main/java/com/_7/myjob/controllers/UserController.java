package com._7.myjob.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com._7.myjob.models.Users;
import com._7.myjob.services.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {
  @Autowired
  private UserServices us;

  @GetMapping("/all")
  public List<Users> GetUsers() {
    return us.getUsers();
  }

  @PostMapping("/add")
  public Users AddUser(@RequestBody Users user) {
    return us.addUsers(user);
  }

  @PutMapping("/update/{id}")
  public Users updateUser(@PathVariable Long id, @RequestBody Users user) {
    return us.updateUser(id, user);
  }
}
