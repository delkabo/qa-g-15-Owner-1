package com.delkabo.config;

import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://demoqa.com")
    String getBaseUrl();

    @Key("baseResolution")
    @DefaultValue("1920x1080")
    String getResolution();

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    @Key("version")
    String version();

    @Key("remote")
    Boolean remote();

}
