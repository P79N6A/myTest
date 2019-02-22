package com.yk.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class MyEventListener implements ApplicationListener<MyEventApplication> {

    @Override
    public void onApplicationEvent(MyEventApplication myEventApplication) {
        System.out.println("监听触发：" + myEventApplication.getName());
    }
}
