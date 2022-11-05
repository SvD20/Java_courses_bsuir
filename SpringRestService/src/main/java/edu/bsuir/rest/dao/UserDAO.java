package edu.bsuir.rest.dao;

import edu.bsuir.rest.entity.User;
import java.util.List;

public interface UserDAO {

    public List<User> getAllUsers();

    void saveUser(User user);

    User getUser(int id);

    void deleteUser(int id);
}
