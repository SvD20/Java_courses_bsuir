package edu.bsuir.service;


import edu.bsuir.dao.UserDAOImpl;
import edu.bsuir.entity.User;
import edu.bsuir.xmlprocessing.XmlWorkerUserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.transaction.Transactional;


@Component
public class UserServiceImpl implements UserService{

    private final static String XmlFile = "C:\\UltimateIdeaProjects\\RIS8\\resources\\JaxB.xml";

    @Autowired
    private UserDAOImpl userDAO;

    @Autowired
    private XmlWorkerUserImpl xmlWorkerUser;

    @Override
    @Transactional
    public void saveUser(User user) {
        user = xmlWorkerUser.userUnmarshalling(XmlFile);
        userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public User getUser(int id) {
        xmlWorkerUser.userMarshalling(userDAO.getUser(id),XmlFile);
        return userDAO.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        User user = xmlWorkerUser.userUnmarshalling(XmlFile);
        id = user.getId();
        userDAO.deleteUser(id);
    }
}
