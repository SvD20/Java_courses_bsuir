package edu.bsuir.rest.service;


import edu.bsuir.rest.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    void saveUser(User user);

    User getUser(int id);

    void deleteUser(int id);
}
