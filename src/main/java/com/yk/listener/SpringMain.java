package com.yk.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther wb-yk449985 2018-12-18 11:52
 **/
public class SpringMain {

    public static void main(String[] args) {
        SpringMain springMain = new SpringMain();
        springMain.init();
    }

    public void init(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");

        applicationContext.publishEvent(new MyEventApplication(this,"123"));
    }
}
