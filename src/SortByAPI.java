import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortByAPI {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("dragonFruit");
        fruits.add("apple");
        fruits.add("banana");
        System.out.println(fruits);

        //sorted Strings

        List<String> sortedList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedList);

        List<String> sortedList2 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList2);

        //sorted Objects

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ann", 30000, 398986627));
        employees.add(new Employee("Max", 20000, 453453453));
        employees.add(new Employee("Alina", 40000, 345657677));
        employees.add(new Employee("Kate", 25000, 676475676));

        //Example 1
        List<Employee> employees1 = employees.stream().sorted(Comparator.comparing(Employee::getPhone)).collect(Collectors.toList());

        //Example 2
        List<Employee> employees2 = employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee t1) {
                return t1.getName().compareTo(employee.getName());
            }
        }).collect(Collectors.toList());

        //Example 3
        List<Employee> employees3 = employees.stream().sorted((a,b) -> b.getSalary() - a.getSalary() ).collect(Collectors.toList());

        System.out.println(employees1);
        System.out.println(employees2);
        System.out.println(employees3);
    }
}
