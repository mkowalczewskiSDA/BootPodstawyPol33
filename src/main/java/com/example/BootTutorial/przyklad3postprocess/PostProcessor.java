package com.example.BootTutorial.przyklad3postprocess;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class PostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName){
        System.out.println("Before Initialization: "+beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("After Initialization: "+beanName);
        return bean;
    }


}
