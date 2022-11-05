package edu.bsuir.rest.controller;


import edu.bsuir.rest.entity.User;
import edu.bsuir.rest.exception_handling.NoSuchUserException;
import edu.bsuir.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> showAllEmployees(){
        List<User> allUsers = userService.getAllUsers();
        return allUsers;
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id){
        User user = userService.getUser(id);

        if(user==null){
            throw new NoSuchUserException("There is no user with ID = " + id + " in Database");
        }

        return user;
    }

    @PostMapping("/users")
    public User addNewUser(@RequestBody User user){

        userService.saveUser(user);
        return user;
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        userService.saveUser(user);
        return user;
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id){
        User user = userService.getUser(id);
        if(user==null){
            throw new NoSuchUserException("There is no user with ID = " +
                    id + " in Database");
        }

        userService.deleteUser(id);
        return "User with ID = " + id + " was deleted.";
    }



}
