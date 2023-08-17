package com.example.student;

public class student {
    String name;
    String email;
    String number;
    String school;
    public student(){
    }
    public student(String name,String email,String number,String school){
        this.name=name;
        this.email=email;
        this.number=number;
        this.school=school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}