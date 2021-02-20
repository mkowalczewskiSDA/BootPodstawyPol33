package com.example.BootTutorial.przyklad1autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    AnotherBean anotherBean;
    YetAnotherBean yetAnotherBean;

    //@Autowired
    public HelloWorld(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    public void getMessage() {
        System.out.println("Hello World");
    }

    @Autowired
    public void setYetAnotherBean(YetAnotherBean yetAnotherBean) {
        this.yetAnotherBean = yetAnotherBean;
    }
}
