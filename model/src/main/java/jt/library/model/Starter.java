package jt.library.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sergey on 17.01.16.
 */
public class Starter {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/jt/library/model/entity/applicationContext_dao.xml");

    }
}
