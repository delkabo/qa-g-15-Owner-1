package com.delkabo.tests;

import com.delkabo.config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class SimpleTest1 {

    @Test
    public void test1() {
        WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
        System.out.println(config.getBaseUrl());
    }
}
