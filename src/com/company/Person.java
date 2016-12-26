package com.company;

/**
 * Created by garkaviy on 15.12.2016.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int phoneNumber;

    public  Person (String firstName){

    }
    public Person (String firstName, String lastName ){

    }
    public Person (String firstName, String lastName, int age ){

    }
    public Person (String firstName, String lastName, int age, String gender ){

    }
    public Person (String firstName, String lastName, int age, String gender, int phoneNumber ){

    }


    public void printPerson(){
        System.out.println(firstName+" "+" " +lastName+" "+age+" "+gender+" "+phoneNumber );
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
