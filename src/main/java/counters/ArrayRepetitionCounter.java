package counters;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayRepetitionCounter implements RepetitionCounter {
    @Override
    public void countRepetition(List<Integer> integerList) {
        List<List> lists = devideOnTwoLists(integerList);
        printPositive(positiveArray(lists.get(0)));
        printNegative(negativeArray(lists.get(1)));
    }

    private List<List> devideOnTwoLists(List<Integer> list) {
        List<Integer> positive = list.stream().filter(element -> element > 0).collect(Collectors.toList());
        List<Integer> negative = list.stream().filter(element -> element < 0).collect(Collectors.toList());
        List<List> lists = new LinkedList<>();
        lists.add(positive);
        lists.add(negative);

        return lists;
    }

    private int findMax(List<Integer> list) {
        int max = 0;
        for (Integer elem : list) {
            if (max < elem) {
                max = elem;
            }
        }
        return max;
    }

    private int[] positiveArray(List<Integer> list) {
        int[] array = new int[findMax(list) + 1];
        for (Integer elem : list) {
            array[elem]++;
        }
        return array;
    }

    private void printPositive(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println("Number " + i + " is in list " + array[i] + " times");
            }
        }
    }

    private void printNegative(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println("Number " + (i * -1) + " is in list " + array[i] + " times");
            }
        }
    }

    private int[] negativeArray(List<Integer> list) {
        return positiveArray(list.stream()
                .map(Math::abs)
                .collect(Collectors.toList()));
    }
}
