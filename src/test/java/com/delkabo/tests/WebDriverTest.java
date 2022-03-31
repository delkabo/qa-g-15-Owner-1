package com.delkabo.tests;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.delkabo.config.DriverSettings;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.w3c.dom.Text;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.source;
import static com.delkabo.config.Browser.CHROME;


public class WebDriverTest {

    @BeforeEach
    public void setUp(){
        DriverSettings.configure();
    }

    @Test
    public void getConfigTest() {
        open("https://yandex.ru/internet/");
        String getBrowser = $$(".general-info__parameter")
                .findBy(text("Браузер")).getText();
        System.out.println(getBrowser);
    }


}
