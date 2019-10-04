package counters;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapRepetitionCounter implements RepetitionCounter {
    @Override
    public void countRepetition(List<Integer> integerList) {
        Map<Integer, Integer> frequencyMap = countRepetitionsInMap(integerList);
        frequencyMap.forEach((key, value) -> System.out.println("Number " + key + " is in list " + value + " times"));
    }

    private Map<Integer, Integer> countRepetitionsInMap(List<Integer> list) {
        Map<Integer, Integer> result = new HashMap<>();
        list.forEach(number -> {
            Integer count = result.get(number);
            if (count == null) {
                count = 0;
            }
            result.put(number, ++count);
        });
        return result;
    }
}
