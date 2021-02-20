package com.example.BootTutorial.zadanie;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class Listener {

    private List<Integer> integers = new ArrayList<>();

    @EventListener
    public void onEven(EvenEvent evenEvent) {
        System.out.println("Is Even");
        Random random = new Random();
        integers.add(random.nextInt(1000));
    }

    @EventListener
    public void onFinished(FinishedEvent finishedEvent) {
        integers.forEach(integer -> System.out.println("Winning number: "+integer));
    }
}
