package com.liucz.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyServiceTest {

    @Autowired
    MyService myService;

    @Test
    public void print() throws Exception{

        myService.print();

    }

}
