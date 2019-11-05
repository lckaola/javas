package com.ljc.abstr;

public class Customer_A {

    public static void main(String[] args) {
        // 具体调用
        CarFactory bmw = new BmwFactory();
        bmw.produceSedan().run();
        bmw.produceTruck().run();


        CarFactory aodi = new AodiFactory();
        aodi.produceSedan().run();
        aodi.produceTruck().run();

    }
}
