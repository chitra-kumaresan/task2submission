package Ttaskon;

public class Person {
    public String name;
    public Integer age;

    public Person(){
        System.out.println("default age is 18");
    }

    public Person(String name,Integer age){
        this.name=name;
        this.age=age;

    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }




}
