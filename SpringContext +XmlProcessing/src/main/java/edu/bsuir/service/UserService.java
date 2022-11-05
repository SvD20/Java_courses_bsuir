package edu.bsuir.service;

import edu.bsuir.entity.User;


public interface UserService  {

    void saveUser(User user);

    User getUser(int id);

    void deleteUser(int id);


}
