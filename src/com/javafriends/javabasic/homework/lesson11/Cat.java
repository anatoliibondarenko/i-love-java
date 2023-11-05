package com.javafriends.javabasic.homework.lesson11;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private String breed;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, double weight, String breed) {
        this(name, age);
        this.weight = weight;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        return Double.compare(cat.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = age;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
