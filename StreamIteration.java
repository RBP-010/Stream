package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIteration {
    public void streamIter(){
        Stream<Integer> integerStream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        integerStream.forEach(element -> System.out.println(element));
    }
    public void stream(){
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);
        originalList.add(6);
        Stream<Integer> stream = originalList.stream();
        System.out.println(originalList);
        Stream<Double> doubleStream = stream.map(num -> num * 2.0);
        System.out.println("Original List:" +originalList);
        List<Double> resultList = doubleStream.collect(Collectors.toList());

        System.out.println("Transformed List (doubled):" +resultList);

    }

    public static void main(String[] args) {
        StreamIteration obj = new StreamIteration();
        obj.streamIter();
        obj.stream();



    }
}
