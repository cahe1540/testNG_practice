package dev.carlos.test;

import org.testng.annotations.Test;

public class test2 {

    @Test(priority = 1)
    public void demo(){
        System.out.println("3 -- prio 1");
    }

    @Test(priority = 2)
    public void demo2(){
        System.out.println("4 -- prio 2");
    }
}
