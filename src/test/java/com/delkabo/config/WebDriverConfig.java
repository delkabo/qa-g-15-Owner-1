package com.delkabo.config;

import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.ru")
    String getBaseUrl();

    @Key("remote")
    Boolean remote();

}
