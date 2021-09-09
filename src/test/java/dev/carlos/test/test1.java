package dev.carlos.test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1 {

    @Test(groups = {"smoke"})
    public void demo(){
        System.out.println("1 -- prio 10");
    }

    @BeforeSuite
    public void demo2(){
        System.out.println("I'm the one above all!!!");
    }

    @Parameters({"url", "APIKEY"})
    @Test
    public void getParam(String param, String APIKEY){
        System.out.println("url: " + param + "-------");
        System.out.println("APIKEY: " + APIKEY + "------");
    }

}
