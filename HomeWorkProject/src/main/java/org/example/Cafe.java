package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cafe {
    private String workTime = "10:00 - 18:00";
    public ArrayList<String> weekends = new ArrayList<>();

    public Cafe() {
        initWeekends();
    }

    public void initWeekends() {
        weekends.add("Понедельник");
        weekends.add("Вторник");
        weekends.add("Среда");
        weekends.add("Четверг");
        weekends.add("Пятница");
        weekends.add("Суббота");
        weekends.add("Воскресенье");
    }

    public void setWorkTime(int firstNumber, int secondNumber) {
        workTime = firstNumber + ":00 - " + secondNumber + ":00";
    }

    public String getWorkTime() {
        return workTime;
    }
    public void addWeekend(String dayOfWeek) {
        weekends.add(dayOfWeek);
    }
    public void removeWeekend(String dayOfWeek) {
        weekends.remove(dayOfWeek);
    }


}
