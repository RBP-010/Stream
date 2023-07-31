package Stream;

import java.util.Arrays;

public class StreamDemo {
    public void generateStream(){
        int[] intArr = {1,2,3,4,5,6,7,8};
        int oddNumbeer = Arrays.stream(intArr)
                .filter(element -> element % 2 ==1).sum();
        System.out.println(oddNumbeer);
    }
//    public void getFirstEvenNumber(){
//        int[] intArr ={12,30,41,5,0};
//        int firstEvenNumber = Arrays.stream(intArr)
//                .filter(element -> element % 2 == 0)
//                .findFirst()
//                .getAsInt();
//        System.out.println(firstEvenNumber);
//    }
//    public void doubleEachElement(){
//        int[] intArr = {1,2,3,4,5,6,7,8};
//         Arrays.stream(intArr)
//                .map(element -> element * 2)
//                .forEach(System.out::println);
//    }

    public static void main(String[] args) {
        StreamDemo obj = new StreamDemo();
        obj.generateStream();
//        obj.getFirstEvenNumber();
//        obj.doubleEachElement();
    }
}
