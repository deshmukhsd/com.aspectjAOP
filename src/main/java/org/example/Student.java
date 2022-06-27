package org.example;

public class Student {
    private Integer age;
    private String name;


    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() throws InterruptedException {
        System.out.println("Age : " + age );
        Thread.sleep(2000);
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() throws InterruptedException {
        System.out.println("Name : " + name );
        Thread.sleep(2000);
        return name;
    }
    public void printThrowException() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Exception raised");
    }
}
