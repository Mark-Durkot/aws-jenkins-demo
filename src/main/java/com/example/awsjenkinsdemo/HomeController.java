package com.example.awsjenkinsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/", produces = "application/json")
public class HomeController {

    @Autowired
    private AppUserRepository userRepo;

    @GetMapping
    public String home() {
        return "Welcome to AWS deployed by Jenkins";
    }

    @GetMapping("/users")
    public List<AppUser> getAllUsers() {
        return userRepo.findAll();
    }

    @GetMapping("/users/{id}")
    public AppUser getUserById(@PathVariable Long id) {
        return userRepo.findById(id).get();
    }

    @PostMapping("/users")
    public AppUser createUser(@RequestBody Map<String, String> body) {
        AppUser user = new AppUser();
        user.setUsername(body.get("username"));
        return userRepo.save(user);
    }

    @DeleteMapping("/users")
    public List<AppUser> deleteUsers(@RequestBody List<Long> ids) {
        for (Long id : ids) {
            userRepo.deleteById(id);
        }

        return userRepo.findAll();
    }

    @DeleteMapping("/users/{id}")
    public List<AppUser> deleteUserById(@PathVariable Long id) {
        userRepo.deleteById(id);
        return userRepo.findAll();
    }

}
