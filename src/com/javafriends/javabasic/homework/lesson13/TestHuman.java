package com.javafriends.javabasic.homework.lesson13;

public class TestHuman {

    public static void main(String[] args) {
        Human childOne = new Human("Katya");
        Human childTwo = new Human("Oleg");
        Human childThree = new Human("Anna");

        Human adultOne = new Human("Olha");
        Human adultTwo = new Human("Andrii");

        Human grandMother = new Human("Nastya");
        Human grandFather = new Human("Ostap");
        adultOne.setMother(grandMother);
        adultOne.setFather(grandFather);

        childOne.setMother(adultOne);
        childOne.setFather(adultTwo);
        childTwo.setMother(adultOne);
        childTwo.setFather(adultTwo);
        childThree.setMother(adultOne);
        childThree.setFather(adultTwo);

        adultOne.addChild(childOne);
        adultOne.addChild(childTwo);
        adultOne.addChild(childThree);
        adultTwo.addChild(childOne);
        adultTwo.addChild(childTwo);
        adultTwo.addChild(childThree);

        System.out.println(childOne);
        System.out.println(childTwo);
        System.out.println(childThree);
        System.out.println(adultOne);
        System.out.println(adultTwo);
    }
}
