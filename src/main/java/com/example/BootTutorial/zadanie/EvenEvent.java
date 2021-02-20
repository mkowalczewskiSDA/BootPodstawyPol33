package com.example.BootTutorial.zadanie;

import org.springframework.context.ApplicationEvent;

public class EvenEvent extends ApplicationEvent {
    public EvenEvent(Object source) {
        super(source);
    }
}
