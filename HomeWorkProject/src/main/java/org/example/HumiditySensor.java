package org.example;

public class HumiditySensor {
    private double max = 100.0;
    public double getHumidity() {
        double randomHumidity = Math.random() * max;
        return randomHumidity;
    }
}
