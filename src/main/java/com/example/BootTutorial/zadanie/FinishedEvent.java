package com.example.BootTutorial.zadanie;

import org.springframework.context.ApplicationEvent;

public class FinishedEvent extends ApplicationEvent {
    public FinishedEvent(Object source) {
        super(source);
    }
}
