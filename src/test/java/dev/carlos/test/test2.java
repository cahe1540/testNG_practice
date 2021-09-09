package dev.carlos.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test2 {

    @BeforeTest
    public void demo(){
        System.out.println("I run before all tests bitch");
    }

    @Test(groups = {"smoke"})
    public void demo1(){
        System.out.println("test2-1");
    }

    @Test(dataProvider = "getData")
    public void login_desktop(String username, String password){
        System.out.println("---------");
        System.out.println(username);
        System.out.println(password);
        System.out.println("---------");
    }

    @BeforeMethod
    public void beforeAll(){
        System.out.println("Before all methods in this test2");
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[3][2];
        // first combo: username, password --user has good credit
        data[0][0] = "George123";
        data[0][1] = "pass123";
        // second combo: username2, password2 -- user has no credit
        data[1][0] = "soyboy555";
        data[1][1] = "qwerty123";
        // third combo: username3, password3 -- user has bad credit
        data[2][0] = "sexy_momma";
        data[2][1] = "pass";
        return data;
    }
}
