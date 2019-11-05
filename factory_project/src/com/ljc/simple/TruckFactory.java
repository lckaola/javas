package com.ljc.simple;


// 卡车的工厂类，根据指定的消息，生产哪种车型，供客户使用
public class TruckFactory {

    public static Trunck produce(String message) {
        switch (message){
            case "宝码":
                return new BwmTruck_s();
            case "奥迪":
                return new AudiTruck_s();
            default:
                return null;
        }}

}
