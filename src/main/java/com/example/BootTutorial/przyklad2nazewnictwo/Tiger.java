package com.example.BootTutorial.przyklad2nazewnictwo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Tiger implements Animal {

    @Override
    public void displayName() {
        System.out.println("I am Tiger");
    }
}
