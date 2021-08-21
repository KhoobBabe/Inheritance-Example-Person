package com.khubaib;

public class Person {

    private String name;
    private String address;
    private String email;
    private String cell;

    Person(String name, String address, String email, String cell){
        this.name = name;
        this.address = address;
        this.email = email;
        this.cell = cell;
    }

    public void setName(String name){

        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void  setEmail(String email){
        this.email = email;

    }

    public void setCell(String cell){
        this.cell = cell;
    }

    public String getAddress() {
        return address;
    }

    public String getCell() {
        return cell;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
    public String toString()
    {
        return "Class : " + getClass().getSimpleName() +
                "\nName : " + getName() +
                "\nCell Number : " + getCell() +
                "\nEmail Address : " + getEmail() +
                "\nAddress : " + getAddress() + "\n";
    }

}

class Student_ extends Person{

    private final String  STATUS;

    Student_(String name, String address, String email, String cell, String STATUS) {
        super(name, address, email, cell);
        this.STATUS = STATUS;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public String toString()
    {
        return "Class : " + getClass().getSimpleName() +
                "\nName : " + getName() +
                "\nCell Number : " + getCell() +
                "\nEmail Address : " + getEmail() +
                "\nAddress : " + getAddress() +
                "\nSTATUS : " + getSTATUS() + "\n";
    }

}

class Employee_ extends Person{

    private String office;
    private int salary;
    private String dateHired;

    Employee_(String name, String address, String email, String cell, String office, int salary, String dateHired) {
        super(name, address, email, cell);
        this.dateHired = dateHired;
        this.office = office;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getDateHired() {
        return dateHired;
    }

    public String getOffice() {
        return office;
    }

    public String toString()
    {
        return ("Class : " + getClass().getSimpleName() +
                "\nName : " + getName() +
                "\nCell Number : " + getCell() +
                "\nEmail Address : " + getEmail() +
                "\nAddress : " + getAddress() +
                "\nOffice : " + getOffice() +
                "\nSalary : " + getSalary() +
                "\nDate Hired : " + getDateHired() + "\n");
    }

}

class Faculty extends Employee_{

    private int officeHours;
    private String rank;

    Faculty(String name, String address, String email, String cell, String office, int salary, String dateHired, int officeHours, String rank) {
        super(name, address, email, cell, office, salary, dateHired);
        this.rank = rank;
        this.officeHours = officeHours;

    }


    public int getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }
    public String toString()
    {
        return ("Class : " + getClass().getSimpleName() +
                "\nName : " + getName() +
                "\nCell Number : " + getCell() +
                "\nEmail Address : " + getEmail() +
                "\nAddress : " + getAddress() +
                "\nOffice : " + getOfficeHours() +
                "\nSalary : " + getSalary() +
                "\nDate Hired : " + getDateHired() +
                "\nRank : " + getRank() +
                "\nOffice Hours " + getOfficeHours() + "\n");
    }

}

class Staff extends Employee_{

    private String title;

    Staff(String name, String address, String email, String cell, String office, int salary, String dateHired, String title) {
        super(name, address, email, cell, office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public String toString()
    {
        return ("Class : " + getClass().getSimpleName() +
                "\nName : " + getName() +
                "\nCell Number : " + getCell() +
                "\nEmail Address : " + getEmail() +
                "\nAddress : " + getAddress() +
                "\nOffice : " + getOffice() +
                "\nSalary : " + getSalary() +
                "\nDate Hired : " + getDateHired() +
                "\nTitle : " + getTitle() + "\n");
    }
}

class PersonTesting{

    public static void main(String[] args) {
        Person person = new Person("Khubaib", "Lahore", "kqur@gmail.com", "0321-562780");
        Student_ student = new Student_("Ali", "karachi", "ali.im@yahoo.com", "0300-537892", "senior");
        Employee_ employee = new Employee_("Maani", "Sialkot", "mani@hotmail.com", "0335-5678987", "Islamabad", 25000, "25-3-2020");
        Faculty faculty = new Faculty("buzdar", "sadiqabad", "buzdar@messanger.com", "0334-6787899", "Karachi", 6, "13-7-2019", 9, "head");
        Staff staff = new Staff("haali", "peshawar", "haali@pakistan.com", "0300-234345", "karachi", 90000, "16-4-2017", "shair");

        System.out.println("PERSON\n" + person.toString());
        System.out.println("STUDENT\n" + student.toString());
        System.out.println("EMPLOYEE\n" + employee.toString());
        System.out.println("FACULTY\n" + faculty.toString());
        System.out.println("STAFF\n" + staff.toString());

    }
}
