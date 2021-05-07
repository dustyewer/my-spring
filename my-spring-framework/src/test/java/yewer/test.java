package yewer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("first.xml");
        User user = (User)applicationContext.getBean("first");
        System.out.println(user);
    }
}
