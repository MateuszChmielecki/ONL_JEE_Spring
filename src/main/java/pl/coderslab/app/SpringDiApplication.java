package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.EmailService;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageSender;

public class SpringDiApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.setMessage("Hello Spring");

        helloWorld.printMessage();

        System.out.println(helloWorld.getMessage());

        EmailService emailService = (EmailService) context.getBean("emailService");
        emailService.send();


        MessageSender messageSender = (MessageSender) context.getBean("messageSender");
        messageSender.sendMessage();
        messageSender.sendMessageFromProperty();

        context.close();



    }
}
