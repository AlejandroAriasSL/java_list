package dev.alejandro;

import java.util.ArrayList;
import java.util.List;

public class WeekDayHandler {

    private List<String> daysOfTheWeek = new ArrayList<>();;

    
    public WeekDayHandler() {
    }

    public void createList(){
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");
        daysOfTheWeek.add("Sunday");
    }

    public List<String> getDays(){
        return daysOfTheWeek;
    }

}