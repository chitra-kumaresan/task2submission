package Ttaskfour;

public class Employee extends Person {
    public Integer employeeid;
    public Integer salary;
    public Employee(Integer employeeid,String name,Integer age,Integer salary){
        super(name,age);
        this.employeeid=employeeid;
        this.salary=salary;
        System.out.print(employeeid+" ");
        System.out.print(name+" ");
        System.out.print(age+" ");
        System.out.println(salary);
    }
    public Integer getEmployeeid() {
        return employeeid;
    }
    public Integer getSalary() {
        return salary;
    }

}
