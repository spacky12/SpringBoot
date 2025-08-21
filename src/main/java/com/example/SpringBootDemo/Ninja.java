package com.example.SpringBootDemo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "select.bike", havingValue = "Ninja")

public class Ninja implements Bike{
    @Override
    public void speed()
    {
        System.out.println("top speed of ninja is 350 kmph");
    }
}
