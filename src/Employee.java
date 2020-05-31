public class Employee {
    private String name;
    private int salary;
    private long phone;

    Employee(String name, int salary, long phone){
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
