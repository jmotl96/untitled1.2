package Springxml;

import Springxml.Beans.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SrringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Ac.xml");

        User theUser = context.getBean("User", User.class);
        boolean testi;
         theUser.login();
        testi=theUser.login();
        System.out.println(testi);
        context.close();
    }
}
