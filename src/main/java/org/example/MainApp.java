package org.example;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        public static void main(String[] args) throws InterruptedException {


           Student student = context.getBean("student",Student.class);
            student.getName();
            student.getAge();

            student.printThrowException();
        }
    }


