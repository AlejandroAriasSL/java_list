package dev.alejandro;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;

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

    @Test
    @DisplayName("It should delete a specified day of the week")
    public void test_delete_specified_day_of_the_week(){

        String day = "Monday";
        weekDayHandler.deleteDay(day);
        assertThat(weekDayHandler.getDays(), not(hasItem(day)));

    }

    @Test
    @DisplayName("It should return the specified day")
    public void test_return_specified_day(){

        String day = "Tuesday";
        String nullDay = "Fork";

        assertThat(weekDayHandler.getSpecificDay(day), is(equalTo(day)));
        assertThat(weekDayHandler.getSpecificDay(nullDay), is(nullValue()));
    }

    @Test
    @DisplayName("It should return boolean if the requested day exists in the list")
    public void test_return_true_if_exists_in_list(){

        String day = "Wednesday";
        String day2 = "Day";

        assertThat(weekDayHandler.dayExists(day), is(true));
        assertThat(weekDayHandler.dayExists(day2), is(false));

    }

    @Test
    @DisplayName("It should sort the list alphabetically")
    public void test_sorts_the_list_alphabetically(){

        weekDayHandler.sortAlphabetically();

        assertThat(weekDayHandler.getDays(), contains("Friday", "Monday", "Saturday", "Sunday", "Thursday", "Tuesday", "Wednesday"));
    }

}
