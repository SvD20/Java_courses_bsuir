package edu.bsuir.xmlprocessing;

import edu.bsuir.entity.User;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@Component
public class XmlWorkerUserImpl implements XmlWorker{

    @Override
    public void userMarshalling(User user, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(User.class);
            Marshaller marshaller = context.createMarshaller();
            // устанавливаем флаг для читабельного вывода XML в JAXB
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            // маршаллинг объекта в файл
            marshaller.marshal(user, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User userUnmarshalling(String filePath) {
        try {
            // создаем объект JAXBContext - точку входа для JAXB
            JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();
            return (User) un.unmarshal(new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
