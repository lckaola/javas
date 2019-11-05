package com.ljc.abstr;

// 具体工厂类，生产产品
public class AodiFactory implements CarFactory {
    @Override
    public Truck_A produceTruck() {
        return new AodiTruck_A();
    }

    @Override
    public Sedan_A produceSedan() {
        return new AodiSedan_A();
    }
}
