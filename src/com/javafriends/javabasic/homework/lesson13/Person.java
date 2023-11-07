package com.javafriends.javabasic.homework.lesson13;

public class Person {
    private String name;
    private String lastname;
    private int age;
    private int weight;
    private int height;

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public Person(String name, String lastname, int age, int weight, int height) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
