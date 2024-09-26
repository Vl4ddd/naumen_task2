package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Employee> listOfEmployes = new ArrayList<>();

        Employee employeFirst = new Employee("Vasya", 12, "Naumen", 100000.2);

        Employee employeSecond = new Employee("Oleg", 14, "Kontyr", 1212.1);

        Employee employeThird = new Employee("Petr", 40, "Sber", 90000.0);

        Employee employeFourth = new Employee("Sasha", 30, "Yandex", 99090909.2);

        Employee employeFifth = new Employee("Kolya", 40, "Wb", 50000.33);

        listOfEmployes.add(employeFirst);
        listOfEmployes.add(employeSecond);
        listOfEmployes.add(employeThird);
        listOfEmployes.add(employeFourth);
        listOfEmployes.add(employeFifth);

        List<Employee> sortedEmployees = listOfEmployes
        .stream()
        .sorted(Comparator.comparing(Employee::getSalary))
        .collect(Collectors.toList());

        

        System.out.println(sortedEmployees.toString());
        for (Employee employee : sortedEmployees) {
            System.out.println(employee.toString());
            
        }

    }

}
