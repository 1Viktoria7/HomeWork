package org.example;

public class HumiditySensor {
     double max = 100.0;
    public double getHumidity() {
        double randomHumidity = Math.random() * max;
        return randomHumidity;
    }
}
