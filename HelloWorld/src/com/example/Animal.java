package com.example;

public class Animal {
    private String name;
    private double bodyLength;
    private double speed;

    public Animal(String name, double bodyLength, double speed) {
        this.name = name;
        this.bodyLength = bodyLength;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(double bodyLength) {
        this.bodyLength = bodyLength;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
