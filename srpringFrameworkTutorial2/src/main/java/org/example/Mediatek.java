package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mediatek implements MobileProcessor{
    @Override
    public void process() {
        System.out.println("second best processor");
    }
}
