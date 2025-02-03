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

    
    public int getSize(){
        return daysOfTheWeek.size();
    }

    
    public void deleteDay(String day){
        daysOfTheWeek.remove(day);
    }

    public String getSpecificDay(String day){
        
        for (String currentDay : daysOfTheWeek)
        if(currentDay == day) return currentDay;    
            
    
        return null;
    }
    
    public boolean dayExists(String day){
        return daysOfTheWeek.contains(day);
    }

}