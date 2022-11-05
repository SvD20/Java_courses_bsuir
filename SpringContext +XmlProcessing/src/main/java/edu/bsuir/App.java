package edu.bsuir;

import edu.bsuir.entity.User;
import edu.bsuir.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {


    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.getUser(7));//пересмотреть айдишники
        System.out.println("Пользователь получен из базы данных и добавлен в xml");
        userService.saveUser(new User());
        //поменять айдишник на 0, чтобы сохранить
        System.out.println("Пользователь из xml добавлен/обновлен в базу данных");
        userService.deleteUser(0);
        System.out.println("Пользователь из xml удален из базы данных");
        context.close();
    }


}
