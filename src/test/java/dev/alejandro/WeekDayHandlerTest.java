package dev.alejandro;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.instanceOf;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WeekDayHandlerTest {

     @Test
    @DisplayName("It should create a list with the days of the week")
    public void test_creates_list_with_days_of_the_week(){

        WeekDayHandler weekDayHandler = new WeekDayHandler();
        weekDayHandler.createList();

        assertThat(weekDayHandler.getDays(), allOf(
        is(instanceOf(List.class)),
        hasItems("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" )));
    }

}
