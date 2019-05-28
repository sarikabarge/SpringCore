package com.bridgeit.spring.generics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class Config {

    @Bean
    private RateFormatter<Integer> integerRateFormatter() {
        return new RateFormatter<Integer>();
    }

    @Bean
    private RateFormatter<BigDecimal> bigDecimalRateFormatter() {
        return new RateFormatter<BigDecimal>();
    }

    @Bean
    private RateCalculator rateCalculator() {
        return new RateCalculator();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        RateCalculator bean = context.getBean(RateCalculator.class);
        bean.calculate();
    }
}
