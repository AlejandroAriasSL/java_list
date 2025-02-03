package dev.alejandro;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.instanceOf;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WeekDayHandlerTest {

    private WeekDayHandler weekDayHandler;

    @BeforeEach
    public void beforeEach(){
        weekDayHandler = new WeekDayHandler();
        weekDayHandler.createList();
    }

    @Test
    @DisplayName("It should create a list with the days of the week")
    public void test_creates_list_with_days_of_the_week(){


        assertThat(weekDayHandler.getDays(), allOf(
        is(instanceOf(List.class)),
        hasItems("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" )));
    }

    @Test
    @DisplayName("It should return the lenght of the list")
    public void test_returns_length_of_the_list(){
        
        assertThat(weekDayHandler.getSize(), is(greaterThan(0)));
        
    }

}
