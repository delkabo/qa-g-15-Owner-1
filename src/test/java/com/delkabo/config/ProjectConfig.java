package com.delkabo.config;

import org.aeonbits.owner.Config;
import org.openqa.selenium.WebDriver;

@Config.Sources({
       "classpath:${remoteProp}.properties"
})
public interface ProjectConfig extends Config {

    @Key("remoteUrl")
    String remoteUrl();

    @Key("browser")
    @DefaultValue("FIREFOX")
    Browser getBrowser();

    @Key("versionBrowser")
    @DefaultValue("Latest")
    String versionBrowser();
}
