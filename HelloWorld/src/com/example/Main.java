package com.example;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("ライオン", 2.1, 80);

        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getBodyLength() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
    }
}
