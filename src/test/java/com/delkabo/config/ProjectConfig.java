package com.delkabo.config;

import org.aeonbits.owner.Config;
import org.openqa.selenium.WebDriver;

//@Config.Sources({
//        "system.properties",
//        "classpath:config/local.properties",
//        "classpath:remote.properties"
//})
public interface ProjectConfig extends Config {


    @Key("remoteProp")
    @DefaultValue("true")
    Boolean remoteProp();
}
