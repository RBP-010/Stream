package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Minmax {
    public void getmimmaxNumber(){
        List<Integer> numbers = Arrays.asList(5,2,8,9,1,7,3,4,6);
        // find maximum
        Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);
        if (maxNumber.isPresent()){
            System.out.println("Maximum number:" +maxNumber.get());
        }else {
            System.out.println("List is empty.");
        }
        // find minimum
        Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo);
        if (minNumber.isPresent()){
            System.out.println("Minimum number:" +minNumber.get());
        }else {
            System.out.println("List is empty.");
        }

    }
    public void

    public static void main(String[] args) {
        Minmax obj = new Minmax();
        obj.getmimmaxNumber();
    }
}
