package com.example.BootTutorial.przyklad1autowired;

import org.springframework.stereotype.Component;

@Component
public class AnotherBean {

    public void anotherMessage() {
        System.out.println("Another message");
    }

}
