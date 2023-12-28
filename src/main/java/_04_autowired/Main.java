package _04_autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("04_auto.xml");
        System.out.println(ctx.getBean("car", AutoCar.class));
    }
}
