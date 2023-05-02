package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext application = new ClassPathXmlApplicationContext("spring.xml");
//        Vehicle vehicle = (Vehicle) application.getBean("tyre");
//        vehicle.drive();
        Car car = (Car) application.getBean("car");
        car.drive();
//        Tyre tyre = (Tyre) application.getBean("tyre");
//        System.out.println(tyre);
    }
}
