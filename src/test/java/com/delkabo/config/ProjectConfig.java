package com.delkabo.config;

import org.aeonbits.owner.Config;
import org.openqa.selenium.WebDriver;

@Config.Sources({
       "classpath:${env}.properties"
})
public interface ProjectConfig extends Config {

    @Key("remoteUrl")
    String remoteUrl();

    @Key("browser")
    Browser getBrowser();

    @Key("versionBrowser")
    String versionBrowser();
}
