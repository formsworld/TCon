package com.td.test.injectiontest.custom;

import com.td.test.injectiontest.dto.Jujilipa;
import com.td.test.injectiontest.dto.Sakeela;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    @ConditionalOnProperty(name= "initSakeela", havingValue = "true")
    public Sakeela getSakeela() {
        return new Sakeela();
    }

    @Bean
    @ConditionalOnProperty(name= "initSakeela", havingValue = "false")
    public Jujilipa getJujilipa() {
        return new Jujilipa()  ;
    }

}
