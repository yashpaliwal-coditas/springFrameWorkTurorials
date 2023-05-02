package org.example;

import org.springframework.stereotype.Component;

@Component
public class Sanpdragon implements MobileProcessor{
    @Override
    public void process() {
        System.out.println("worlds best cpu");
    }
}
