import java.util.WeakHashMap;

public class Employee {
    String name;
    int age;
    public Employee(String employeeName, int employeeAge){
        name = employeeName;
        age = employeeAge;
    }

    public static void main(String[] args) {
        Employee em1 = new Employee("Lakshitha",23);
        Employee em2 = new Employee("Madushan", 25);
        System.out.println("My name is "+em1.name + " and age is " + em1.age);
        System.out.println("My name is "+em2.name + " and age is " + em2.age);
    }
}
