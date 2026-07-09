package com.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main class - Entry point for Assignment 5.
 * Demonstrates mixed injection styles in a layered application:
 * - UserRepository -> UserService : Setter Injection
 * - UserService -> UserController : Constructor Injection
 */
public class App {

    public static void main(String[] args) {

        // Load Spring XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Retrieve the UserController bean (all dependencies are already injected)
        UserController controller = (UserController) context.getBean("userController");

        // Call execute() - triggers the full chain: Controller -> Service -> Repository
        controller.execute();
    }
}
