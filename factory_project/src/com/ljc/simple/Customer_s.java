package com.ljc.simple;


// 简单工厂类
public class Customer_s {
    public static void main(String[] args) {
        TruckFactory.produce("宝码").run();
        TruckFactory.produce("奥迪").run();

    }
}
