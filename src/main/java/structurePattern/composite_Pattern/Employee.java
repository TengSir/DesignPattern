package structurePattern.composite_Pattern;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;//部下

    //constructor
    public Employee(String name, String dept, int salary,
                    List<Employee> subordinates) {
        super();
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = subordinates;
        subordinates = new ArrayList<Employee>();
    }


    public Employee(String name, String dept, int salary) {
        super();
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }


    public void add(Employee e){
        subordinates.add(e);
    }

    public void remove(Employee e){
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return "Employee :[ Name : " + name
                + ", dept : " + dept + ", salary :"
                + salary + " ]";
    }
    public static void main(String[] args) {

        Employee CEO = new Employee("John","CEO", 30000);
        Employee headSales = new Employee("Robert","Head Sales", 20000);
        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);
        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);
        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);
        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //打印该组织的所有员工
        System.out.println("-------------------公司员工情况----------------------");
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            //打印CEO的直属一级部下
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                //打印CEO的二级部下
                System.out.println(employee);
            }
        }

    }
}