package functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<String> {
    @Override
    public void accept(String o) {
        System.out.println("Example 1: " + o.length());
    }

    public static void main(String[] args) {

        //Example 1

        Consumer<String> consumer = new ConsumerImpl();
        consumer.accept("Maxim");

        //Example 2

        Consumer<String> consumer2 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Example 2: " + s);
            }
        };
        consumer2.accept("Salary");

        //Example 3

        Consumer<String> consumer3 = (a) -> System.out.println("Example 3: " + a);
        consumer3.accept("Salary2");
    }




}
