package edu.cnm.deepdive;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class ClockAnglesTest {
    static final double TOLERANCE = 0.01;

    @Test
    void hourHandDegrees() {
    }

    @ParameterizedTest(name ="[{index}] Minutes= {0}, expected = {1}")
    @CsvFileSource(resources = "clock-min.csv")
    void minuteHandDegrees(double minutes, double expected) {
        double actual = ClockAngles.minuteHandDegrees(minutes);
        assertEquals(expected,actual,TOLERANCE);

    }
}