package com.automationpractice.core;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    //TODO Add parametrization for Selenium Grid
    @BeforeClass
    protected void setConfiguration() {
        Configuration.timeout = 10000;
        Configuration.baseUrl = "http://automationpractice.com/index.php";
    }

    @BeforeMethod(alwaysRun = true)
    public void openHomePage() {
        open(Configuration.baseUrl);
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        close();
    }
}
