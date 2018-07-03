package by.vpshulga.lesson24.entities;


import by.vpshulga.lesson24.enums.Sex;

public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Sex sex;

    public Person(String firstName, String secondName, int age, Sex sex) {
        this.firstName = firstName;
        this.lastName = secondName;
        this.age = age;
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
