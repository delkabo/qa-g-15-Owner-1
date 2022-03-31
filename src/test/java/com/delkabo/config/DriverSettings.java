package com.delkabo.config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.ObjectInputFilter;
import java.util.function.Supplier;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Browsers.FIREFOX;

public class DriverSettings {

    public static void configure() {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        ProjectConfig config = ConfigFactory.create(ProjectConfig.class, System.getProperties());

        Configuration.browser = config.getBrowser().toString();
        capabilities.setCapability("browserVersion", config.versionBrowser());

        if(config.remoteUrl() != ""){
            Configuration.remote = config.remoteUrl();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
       }
//        if(config.remoteProp() == true){
//            Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub/";
//            capabilities.setCapability("enableVNC", true);
//            capabilities.setCapability("enableVideo", true);
//       }
        Configuration.browserCapabilities = capabilities;
    }


}
