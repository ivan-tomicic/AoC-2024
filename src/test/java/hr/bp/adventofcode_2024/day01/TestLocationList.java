package hr.bp.adventofcode_2024.day01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLocationList {

    @Test
    public void testCalculatingDistances_givenValidInputOne_returnsCorrectSumOfDistances() {
        String input = TestUtils.inputOne();
        LocationList locationList = new LocationList(input);

        long expectedSumOfDistances = 11;

        long actualSumOfDistances = locationList.getSumOfDistances();

        Assertions.assertEquals(expectedSumOfDistances, actualSumOfDistances);
    }
}
