package com.example;

public class Employee{
    private String fullName;
    private int age;
    private String department;
    private Double salary;

    public Employee(String fullName, int age, String department, Double salary){
        this.fullName = fullName;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getFullName(){
        return fullName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }

    public void setSalary(Double salary){
        this.salary = salary;
    }

    public Double getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + fullName + '\'' +
                " age='" + age + '\'' +
                " department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

}
