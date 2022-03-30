package com.delkabo.tests;


import com.delkabo.config.DriverSettings;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.open;


public class WebDriverTest {

    private WebDriver driver;

    FirefoxOptions firefoxOptions = new FirefoxOptions();

    private WebDriver driver2;

    @BeforeEach
    public void setUp() {
        DriverSettings.configure();
        //driver = new WebDriverProvider().get();
        try {
            driver2 = new RemoteWebDriver(new URL("https://user1:1234@selenoid.autotests.cloud/wd/hub/"), firefoxOptions);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getConfigTest() {
//        open("https://opennet.ru");
        open("https://yandex.ru/internet/");
//        driver.getTitle();
        //parameter-wrapper__parameter-header

        System.out.println(driver2.getPageSource());

    }


}
