package homework4.person.homework4.homework4.demo;

import homework4.person.homework4.employee.Employee;

public class Demo {
    public static void main(String[] args) {
        Employee emp = new Employee("fullanme", 40, "male");
        char [] category = {'A','F'};
        emp.setRate(0);
        emp.setCategory(category);
    }
}
