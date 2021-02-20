package com.example.BootTutorial.przyklad2nazewnictwo;

import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal {

    @Override
    public void displayName() {
        System.out.println("I am Lion");
    }
}
