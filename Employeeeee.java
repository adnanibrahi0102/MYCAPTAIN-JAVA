
package com.captain;
class Employee{
    // creating variables
    private String name, address;
    private int year, salary;
    public Employee(String n, int y, int sal, String add){
        name = n;
        year = y;
        salary = sal;
        address = add;
    }
    // creating getters
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public int getSalary(){
        return salary;
    }
    public String getAddress(){
        return address;
    }
}
class Emp {

    public static void main(String[] args) {
        Employee e1 = new Employee("ADNAN IBRAHIM", 2022, 500000, "kolkata");
        Employee e2 = new Employee("SAHIL KUMAR", 2021, 400000, "jammu");
        Employee e3 = new Employee("AAMID FAROOQ", 2019, 600000, "kashmir");
        System.out.println("Name\tYear of joining\tSalary\tAddress");
        // printing details of employee 1
        System.out.println(e1.getName() + "\t" + e1.getYear() + "\t\t\t" + e1.getSalary() + "\t" + e1.getAddress());
        // printing details of employee 2
        System.out.println(e2.getName() + "\t\t" + e2.getYear() + "\t\t\t" + e2.getSalary() + "\t" + e2.getAddress());
        // printing details of employee 3
        System.out.println(e3.getName() + "\t" + e3.getYear() + "\t\t\t" + e3.getSalary() + "\t" + e3.getAddress());
    }
}
