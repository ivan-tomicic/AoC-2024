package hr.bp.adventofcode_2024.day01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static hr.bp.adventofcode_2024.Utils.readInputForDay;

/**
 * @author Ivan Tomičić
 */
public class TestLocationList {

    @Test
    public void testCalculatingDistances_givenValidInputOne_returnsCorrectSumOfDistances() {
        String input = TestUtils.inputOne();
        LocationList locationList = new LocationList(input);

        long expectedSumOfDistances = 11;

        long actualSumOfDistances = locationList.getSumOfDistances();

        Assertions.assertEquals(expectedSumOfDistances, actualSumOfDistances);
    }

    @Test
    public void testCalculatingDistances_givenTaskInput_returnsCorrectSumOfDistances() {
        String input = readInputForDay("day01");
        LocationList locationList = new LocationList(input);

        long expectedSumOfDistances = 936063;

        long actualSumOfDistances = locationList.getSumOfDistances();

        Assertions.assertEquals(expectedSumOfDistances, actualSumOfDistances);
    }

    @Test
    public void testCalculatingSimilarityScore_givenValidInputOne_returnsCorrectSimilarityScore() {
        String input = TestUtils.inputOne();
        LocationList locationList = new LocationList(input);

        long expectedSumOfDistances = 31;

        long actualSumOfDistances = locationList.getSimilarityScore();

        Assertions.assertEquals(expectedSumOfDistances, actualSumOfDistances);
    }

    @Test
    public void testCalculatingSimilarityScore_givenTaskInput_returnsCorrectSimilarityScore() {
        String input = readInputForDay("day01");
        LocationList locationList = new LocationList(input);

        long expectedSumOfDistances = 23150395;

        long actualSumOfDistances = locationList.getSimilarityScore();

        Assertions.assertEquals(expectedSumOfDistances, actualSumOfDistances);
    }
}
