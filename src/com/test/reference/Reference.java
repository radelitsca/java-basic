package com.test.reference;

public class Reference {

    public static void main (String[] args) {
        Person olga = new Person();
        Person inna = new Person();

        olga.name="Olga";
        olga.age = 10;


        inna.name = "inna";
        inna.age =15;

        System.out.println("Olga age is:" + olga.age + "Inna age:" + inna.age);

        swapage (olga, inna);
        System.out.println("Olga age is:" + olga.age + "Inna age:" + inna.age);

    }

    private static void swapage(Person olga, Person inna) {
        int tempAge = olga.age;
        olga.age = inna.age;
        inna.age = tempAge;
    }

    static class Person {
        String name;
        int age;
    }
}
