package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.*;;



public class StreamExample {


    public static void run() {
        
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        int result = nums.stream()
                            .filter(n -> n%2 == 0)
                            .map(n -> n*2)
                            .reduce(10, (c,e) -> c+e);
                            System.out.println(result);

       // Stream<Integer> s1 = nums.stream().filter(n -> n % 2 == 0);

       // Consumer con = t -> System.out.println(t);
           

       // s1.forEach(t -> System.out.println(t));
       
    }
}