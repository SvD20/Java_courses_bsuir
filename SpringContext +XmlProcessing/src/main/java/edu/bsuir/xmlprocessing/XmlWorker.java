package edu.bsuir.xmlprocessing;

import edu.bsuir.entity.User;

public interface XmlWorker {

    void userMarshalling(User user, String filepath);

    User userUnmarshalling(String filepath);

}
