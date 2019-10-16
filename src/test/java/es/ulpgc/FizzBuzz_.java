package es.ulpgc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(org.junit.runners.Parameterized.class)
public class FizzBuzz_ {

    private final int number;
    private final String value;

    public FizzBuzz_(int number, String value) {
        this.number = number;
        this.value = value;
    }

    @Test
    public void execute(){
        assertThat(FizzBuzz.of(number)).isEqualTo(value);
    }

    @Parameterized.Parameters
    public static Object[][] cases(){
        return new Object[][]{
        {1,"1"},
        {2,"2"},
        {3,"Fizz"},
        {5,"Buzz"},
        {6,"Fizz"},
        {7,"7"},
        {10,"Buzz"},
        {12,"Fizz"},
        {13,"13"},
        {15,"FizzBuzz"},
        {23,"23"},
        {30,"FizzBuzz"}
        };
    }



}

