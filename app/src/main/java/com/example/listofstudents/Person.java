package com.example.listofstudents;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    int age;
    double height;
    double weight;
    String profession;

    public Person(String name, int age, double height, double weight, String profession) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.profession = profession;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
    @NonNull
    @Override
    public String toString() {
        return "Person name: " + name +" ; " + " \n age: " + age +"\nHeight: "+height+";"+"\nWeight: "+ weight+";"+ "\nProfession: " + profession+"";
    }

}
