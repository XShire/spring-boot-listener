package com.liucz.service;

import com.liucz.event.MyEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    ApplicationContext applicationContext;

    public void print() throws Exception{

        //...省略业务逻辑

        //发布UserRegisterEvent事件
        String message = "我是被监听事件。。。。";
        applicationContext.publishEvent(new MyEvent(this, message));
    }

}
