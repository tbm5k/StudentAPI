package com.tbm5k.StudentAPI.com.tbm5k.StudentAPI.code;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private String id;
    private String firstName;
    private char gender;

    public Student() {

    }

    public Student(String id, String firstName, char gender) {
        this.id = id;
        this.firstName = firstName;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public char getGender() {
        return gender;
    }
}
