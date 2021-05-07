package yewer;

import org.springframework.context.ApplicationContext;

public class test2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new MyApplicationContext("first.xml");
        User user = (User) applicationContext.getBean("first");
        System.out.println(user);

    }
}
