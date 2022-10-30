package com.cursor.HW5.configuration;

import com.cursor.HW5.extraClasses.ExtraUserData;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public String getName()
    {
        return "";
    }

    @Bean
    public ExtraUserData firstUser()
    {
        return new ExtraUserData("Ukraine", "+380931234567");
    }
}
