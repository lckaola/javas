package com.ljc.abstr;

//抽象的工厂，接口
public interface CarFactory {
    // 生产卡车的接口
    public Truck_A produceTruck();
    // 生产轿车的接口
    public Sedan_A produceSedan();
}
