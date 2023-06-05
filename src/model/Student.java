package model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String id;
    String name;
    int age;
    String course;
    String address;
    String school;
    float toan;
    float ly;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void tinhdiem(float a, float b){
        float c = (a+b)/2;
        if(c>8){
            System.out.println("Bạn là học sinh giỏi");
        } else if (c>6) {
            System.out.println("Bạn là học sinh khá");
        } else {
            System.out.println("Bạn là học sinh trung bình");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }



    public String getClassification() {
        return classification;
    }

    public float getLy() {
        return ly;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    String classification;


}
