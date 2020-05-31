package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionImpl implements Function<String, Integer> {
    @Override
    public Integer apply(String o) {
        return o.length() ;
    }

    public static void main(String[] args) {

        //Example 1

        Function<String, Integer> function = new FunctionImpl();
        System.out.println(function.apply("sdasdasd"));

        //Example 2

        Function<String, Integer> function2 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        System.out.println(function2.apply("3efcddcdedx"));

        //Example 3

        Function<String,Integer> function3 = String::length;
        Function<Integer,Integer> function4 = (a) -> a + 3;
        System.out.println(function3.apply("3efcddcdedx"));

        Integer integer = function3.andThen(function4).apply("a");
        System.out.println(integer);

        //Using stream().map()

        List<User> users = new ArrayList<>();
        users.add(new User("Kate", 232553,124234));
        users.add(new User("Max", 67832553,124234));
        users.add(new User("Dan", 932553,124234));
        users.add(new User("Sole", 65553,124234));

        List<UserClone> userClones = users.stream()
                .map((User user) -> new UserClone(user.getName(), user.getSalary(), user.getPhone()))
                .collect(Collectors.toList());
        userClones.forEach(System.out::println);
    }
}
class UserClone{
    private String name;
    private int salary;
    private long phone;

    UserClone(String name, int salary, long phone){
        this.name = name;
        this.salary = salary;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public long getPhone(){
        return phone;
    }

    public void setPhone(long phone){
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", phone=" + phone +
                '}';
    }
}

class User{
    private String name;
    private int salary;
    private long phone;

    User(String name, int salary, long phone){
        this.name = name;
        this.salary = salary;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public long getPhone(){
        return phone;
    }

    public void setPhone(long phone){
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", phone=" + phone +
                '}';
    }
}
