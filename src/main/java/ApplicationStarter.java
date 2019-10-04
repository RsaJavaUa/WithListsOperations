import counters.ArrayRepetitionCounter;
import counters.MapRepetitionCounter;
import counters.RepetitionCounter;
import counters.SetRepetitionCounter;

import java.util.Arrays;
import java.util.List;

public class ApplicationStarter {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(15, 10, 15, 7, 8, 8, 15, 1, 3, 4, 1);
        RepetitionCounter repetitionCounter = new MapRepetitionCounter();

        long beginTime = System.nanoTime();
        repetitionCounter.countRepetition(integerList);
        long endTime = System.nanoTime();
        System.out.println("MapRepCounter time is " + (endTime - beginTime));

        repetitionCounter = new SetRepetitionCounter();
        beginTime = System.nanoTime();
        repetitionCounter.countRepetition(integerList);
        endTime = System.nanoTime();
        System.out.println("SetRepCounter time is " + (endTime - beginTime));

        repetitionCounter = new ArrayRepetitionCounter();
        beginTime = System.nanoTime();
        repetitionCounter.countRepetition(integerList);
        endTime = System.nanoTime();
        System.out.println("ArrayRepCounter time is " + (endTime - beginTime));
    }
}
