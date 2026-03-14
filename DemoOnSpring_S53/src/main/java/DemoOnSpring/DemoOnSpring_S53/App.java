package DemoOnSpring.DemoOnSpring_S53;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Car c1 = (Car) context.getBean("car1Bean");
        c1.displayEngineType();
    }
}
