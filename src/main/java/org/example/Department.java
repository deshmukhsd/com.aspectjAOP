package org.example;

public class Department {
    private static int deptNum=12;

    public  void deptNum() throws InterruptedException {
        System.out.println("The Department Number is : "+deptNum);
        Thread.sleep(2000);
        ClassName className=MainApp.context.getBean("class",ClassName.class);
        className.className();
    }
}
