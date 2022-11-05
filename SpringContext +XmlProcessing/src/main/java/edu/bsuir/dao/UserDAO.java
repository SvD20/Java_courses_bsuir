package edu.bsuir.dao;

import edu.bsuir.entity.User;

public interface UserDAO {

    void saveUser(User user);

    User getUser(int id);

    void deleteUser(int id);

}
