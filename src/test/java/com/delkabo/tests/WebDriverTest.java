package com.delkabo.tests;


import com.delkabo.config.DriverSettings;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


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
