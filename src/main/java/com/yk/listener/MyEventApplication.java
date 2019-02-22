package com.yk.listener;

import org.springframework.context.ApplicationEvent;


public class MyEventApplication extends ApplicationEvent {

    private String name;

    public MyEventApplication(Object source,String name) {
        super(source);
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
