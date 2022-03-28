package com.delkabo.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:file:C:/Users/delkabo/Desktop/token.properties",
        "classpath:token.properties"
})
public interface TokenConfig extends Config {

    @Key("token")
    String token();
}
