package pl.sda.javastart.day2;

import org.junit.Test;

import static org.junit.Assert.*;

public class IfsExampleTest {

    @Test
    public void shouldNotAnswerBecauseWeAreAsleep() {
        boolean isMama = true;
        boolean isMorning = true;
        boolean isAsleep = true;

        boolean result = IfsExample.answerCell(isMama, isMorning, isAsleep);
        assertFalse(result);
    }
    public void shouldNotAnswerBecauseWeAreNotAsleepAndItIsMorningAndNotMaum() {
        boolean isMama = false;
        boolean isMorning = true;
        boolean isAsleep = false;

        boolean result = IfsExample.answerCell(isMama, isMorning, isAsleep);
        assertFalse(result);
    }
}