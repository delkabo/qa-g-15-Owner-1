package com.delkabo.config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.ObjectInputFilter;
import java.util.function.Supplier;

public class DriverSettings {

    public static void configure() {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        ProjectConfig config = ConfigFactory.create(ProjectConfig.class, System.getProperties());

        if(config.remoteProp() == true){
            Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub/";
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
       }
        Configuration.browserCapabilities = capabilities;
    }


}
