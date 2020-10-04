package com.cybertek.tests.control;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class FirstClass  extends TestBase {


    @Test
    public void test1(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsDriver();
        //DashboardPage dashboardPage = new DashboardPage();
        //dashboardPage.navigateToModule("");
    }


}