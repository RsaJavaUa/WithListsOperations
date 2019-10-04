package counters;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetRepetitionCounter implements RepetitionCounter {

    @Override
    public void countRepetition(List<Integer> integerList) {
        Set<Integer> distinct = new HashSet<>(integerList);
        distinct.forEach(number -> System.out.println("Number " + number + " is in list " + Collections.frequency(integerList, number)+" times"));
    }
}
