package dev.carlos.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class HomeLoans {

    @Test
    public void home_loan_start(){
        System.out.println("Home Loan Start");
    }

    @AfterTest
    public void web_login_home(){
        System.out.println("I'll go after all home loan tests.");
    }

    @Test
    public void mobile_login_home(){
        System.out.println("mobile_login_home");
    }

    @Test(groups = {"smoke"})
    public void mobile_login_home2(){
        System.out.println("mobile_login_home2");
    }

    public void mobile_login_home3(){
        System.out.println("mobile_login_home3");
    }

    @Test
    public void api_login_home(){
        System.out.println("api_login_home");
    }
}
