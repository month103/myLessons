import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByLambda {
    static public  void main(String[] args)  {

        List<Employee> employees = new ArrayList<>(

        );
        employees.add(new Employee("Ann", 20000, 398986627));
        employees.add(new Employee("Max", 30000, 453453453));
        employees.add(new Employee("Alina", 40000, 345657677));
        employees.add(new Employee("Kate", 25000, 676475676));

        //Example 1

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee a, Employee b) {
                return b.getName().compareTo(a.getName());
            }
        });
        System.out.println("Example 1" + employees);


        //Example 2

        Collections.sort(employees, (a, b) -> a.getName().compareTo(b.getName()));
        System.out.println("Example 2" + employees);

        //Example 3

        Collections.sort(employees, new myClass());
        System.out.println("Example 3" + employees);
    }
}

class myClass implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b) {
        return  a.getSalary() - b.getSalary();
    }

}