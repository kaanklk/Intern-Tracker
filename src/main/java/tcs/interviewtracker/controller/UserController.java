package tcs.interviewtracker.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import tcs.interviewtracker.persistence.User;
import tcs.interviewtracker.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {

    private UserService service;

    UserController(UserService service){
        this.service = service;
    }

    @GetMapping("users")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }

    @GetMapping("users/{id}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public User getUserById(@PathVariable Long id){
        return service.getUserById(id);
    }

    @PostMapping("users")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody User user){
        service.saveUser(user);
    }

    @PutMapping("users/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateUserById(@PathVariable Long id, @RequestBody User user){
        service.updateUser(id,user);
    }

    @DeleteMapping("users/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUserById(@PathVariable Long id){
        service.deleteUser(id);
    }


}
