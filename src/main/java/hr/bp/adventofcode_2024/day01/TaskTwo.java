package hr.bp.adventofcode_2024.day01;

import static hr.bp.adventofcode_2024.Utils.displayResult;
import static hr.bp.adventofcode_2024.Utils.readInputForDay;

public class TaskTwo {

    public static void main(String[] args) {
        String input = readInputForDay("day01");
        LocationList locationList = new LocationList(input);

        long sum = locationList.getSimilarityScore();

        displayResult(sum);
    }
}
