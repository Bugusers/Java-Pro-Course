package org.course.hw3;


/*
 * First Task
 */
public class Employee {
    private String fullname;
    private String email;
    private String phone;
    private String position;
    private int age;

    public Employee(String name, String surname, String email, String phone, String position, int age) {
        this.fullname = name + " " + surname;
        this.email = email;
        this.phone = phone;
        this.position = position;
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
