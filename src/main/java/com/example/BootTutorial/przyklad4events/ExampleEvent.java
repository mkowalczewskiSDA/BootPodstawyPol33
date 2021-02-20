package com.example.BootTutorial.przyklad4events;

import org.springframework.context.ApplicationEvent;

public class ExampleEvent extends ApplicationEvent {

    private String message;

    public ExampleEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
