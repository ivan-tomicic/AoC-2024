package hr.bp.adventofcode_2024.day01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class LocationList {
    
    private List<Integer> listOne = new ArrayList<>();
    
    private List<Integer> listTwo = new ArrayList<>();
    
    public LocationList(String input) {
        for (String line : input.split("\\n")) {
            int firstNumber = Integer.parseInt(line.split("\\s+")[0].strip());
            
            int secondNumber = Integer.parseInt(line.split("\\s+")[1].strip());
            
            listOne.add(firstNumber);
            listTwo.add(secondNumber);
        }
    }

    public long getSumOfDistances() {
        listOne.sort(Integer::compareTo);
        listTwo.sort(Integer::compareTo);

        return IntStream.range(0, listOne.size())
                .mapToObj(i -> Math.abs(listOne.get(i) - listTwo.get(i)))
                .toList().stream().mapToLong(Long::valueOf)
                .reduce(Long::sum).getAsLong();
    }
}
