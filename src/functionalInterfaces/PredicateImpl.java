package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateImpl implements Predicate<Integer> {

    @Override
    public boolean test(Integer o) {
        return o > 5;
    }


    public static void main(String[] args) {

        // example 1

        Predicate<Integer> predicate = new PredicateImpl();
        System.out.println("example 1 " + predicate.test(3));


        //example 2

        List<Integer> list = Arrays.asList(2,34,5465,234234,2,54,76,2,4,9);
        Predicate<Integer> predicate2 = new Predicate<>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 43;
            }
        };

        List a = list.stream().filter(predicate2).sorted().collect(Collectors.toList());
        System.out.println("example 2 " + a);

        //example 3

        Predicate<Integer> predicate3 = (t) -> t > 53;
        System.out.println("example 3:");
        list.stream().filter(predicate3).collect(Collectors.toList()).forEach(System.out::println);
    }
}
