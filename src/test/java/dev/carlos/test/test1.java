package dev.carlos.test;

import org.testng.annotations.Test;

public class test1 {

    @Test(priority = 10)
    public void demo(){
        System.out.println("1 -- prio 10");
    }

    @Test(priority = 5)
    public void demo2(){
        System.out.println("2 -- prio 5");
    }
}
