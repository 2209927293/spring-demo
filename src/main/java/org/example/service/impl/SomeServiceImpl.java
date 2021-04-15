package org.example.service.impl;

import org.example.service.SomeService;

public class SomeServiceImpl implements SomeService {

    public  SomeServiceImpl(){
        System.out.println("创建对象");
    }

    public  SomeServiceImpl(String name){
        System.out.println("创建有参对象");
    }

    @Override
    public void doSome() {
        System.out.println("执行doSome");
    }
}
