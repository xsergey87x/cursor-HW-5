package com.cursor.HW5.configuration;

import com.cursor.HW5.entities.ExtraUserData;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("com.cursor.HW5.entities")
@ConditionalOnClass(name="com.cursor.HW5.conditional.ConfigurationEnabler")
@PropertySource("classpath:application.properties")
public class OwnConfiguration {


    @Bean
    public String getName()
    {
        return "Hello world";
    }

    @Bean
    @ConditionalOnProperty(name = "custom.configuration.enabled", havingValue = "true")
    public ExtraUserData firstUser()
    {
        return new ExtraUserData("Ukraine", "+380931234567");
    }
}
