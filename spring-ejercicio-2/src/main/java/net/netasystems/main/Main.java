package net.netasystems.main;

import net.netasystems.business.Programmer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio #2 de Spring");
        ApplicationContext context = new ClassPathXmlApplicationContext("file:C:/Users/Antoinette1/Desktop/java neta/applicationContext.xml");
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Programmer prgm1 = context.getBean("amaroProgrammer", Programmer.class);
        Programmer prgm2 = context.getBean("masterProgrammer", Programmer.class);
        Programmer prgm3 = context.getBean("jorgeSaulTr", Programmer.class);
        System.out.println("El programador #1 lo hace en: "+prgm1.hackTheWorld());
        System.out.println("El programador #2 lo hace en: "+prgm2.hackTheWorld());
        System.out.println("El programador #3 lo hace en: "+prgm3.hackTheWorld());
    }
}
