package com.delkabo.config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.ObjectInputFilter;
import java.util.Properties;
import java.util.Scanner;
import java.util.function.Supplier;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Browsers.FIREFOX;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DriverSettings {

    public static void configure() {

        DesiredCapabilities capabilities = new DesiredCapabilities();

 //       System.setProperty("env", "remote");
        Properties p = System.getProperties();
        String s = p.getProperty("env");
        System.out.println(s);





        if(s == null){

 //           assertThat(p.getProperty("env")).isEqualTo(null);

            System.setProperty("env", "locale");
            ProjectConfig config = ConfigFactory.create(ProjectConfig.class, System.getProperties());
            Configuration.browser = config.getBrowser().toString();
            capabilities.setCapability("browserVersion", config.versionBrowser());


//            System.setProperty("env", "remote");
//            ProjectConfig config = ConfigFactory.create(ProjectConfig.class, System.getProperties());
//            Configuration.remote = config.remoteUrl();
//            Configuration.browser = config.getBrowser().toString();
//            capabilities.setCapability("browserVersion", config.versionBrowser());
//            capabilities.setCapability("enableVNC", true);
//            capabilities.setCapability("enableVideo", true);

        } else if(s == "remote") {
            System.setProperty("env", "remote");
            ProjectConfig config = ConfigFactory.create(ProjectConfig.class, System.getProperties());
            Configuration.remote = config.remoteUrl();
            Configuration.browser = config.getBrowser().toString();
            capabilities.setCapability("browserVersion", config.versionBrowser());
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
        } else if(s == "locale") {
            System.setProperty("env", "locale");
            ProjectConfig config = ConfigFactory.create(ProjectConfig.class, System.getProperties());
            Configuration.browser = config.getBrowser().toString();
            capabilities.setCapability("browserVersion", config.versionBrowser());
        }


//        if(config.remoteProp() == true){
//            Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub/";
//            capabilities.setCapability("enableVNC", true);
//            capabilities.setCapability("enableVideo", true);
//       }
        Configuration.browserCapabilities = capabilities;
    }


}
