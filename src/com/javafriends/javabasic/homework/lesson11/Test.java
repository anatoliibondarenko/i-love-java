package com.javafriends.javabasic.homework.lesson11;

public class Test {

    public static void main(String[] args) {

        Cat simpleCat = new Cat();
        Cat anotherCat = new Cat("Murzik", 2);
        System.out.println(simpleCat);
        System.out.println(anotherCat);
        System.out.println();

        Cat cat1 = new Cat("Vasya", 4, 6.5, "American Shorthair");
        Cat cat2 = new Cat("Komarik", 7, 4.5, "Manx");
        Cat cat3 = new Cat("Tom", 3, 18.2, "Maine Coon");
        Cat cat4 = new Cat("Bubonchik", 3, 18.2, "Caracal");

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println("cat1 equals cat2 : " + cat1.equals(cat2));

        System.out.println(cat3);
        System.out.println(cat4);
        System.out.println("cat3 equals cat4 : " + cat3.equals(cat4));
        System.out.println();

        try {
            PasswordGenerator passwordGenerator = new PasswordGenerator(8);
            for (int i = 0; i < 10; i++) {
                System.out.println(passwordGenerator.nextPassword());
            }
            System.out.println();

            PasswordGenerator passwordGenerator1 = new PasswordGenerator(16);
            System.out.println(passwordGenerator1.nextPassword());
            System.out.println();

            PasswordGenerator passwordGenerator2 = new PasswordGenerator(3);
            System.out.println(passwordGenerator2.nextPassword());
            System.out.println();

            PasswordGenerator passwordGenerator3 = new PasswordGenerator(2);
            System.out.println(passwordGenerator3.nextPassword());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
