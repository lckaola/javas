package com.ljc.abstr;

// 具体工厂类，生产产品
public class BmwFactory implements CarFactory {
    @Override
    public Truck_A produceTruck() {
        return new BmwTruck_A();
    }

    @Override
    public Sedan_A produceSedan() {
        return new BmwSedan_A();
    }
}
