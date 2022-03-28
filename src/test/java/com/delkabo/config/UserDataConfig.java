package com.delkabo.config;

import org.aeonbits.owner.Config;

public interface UserDataConfig extends Config {

    @Key("firstname")
    @DefaultValue("Ivan")
    String getName();

    @Key("lastName")
    @DefaultValue("Ivanov")
    String getLastName();

}
