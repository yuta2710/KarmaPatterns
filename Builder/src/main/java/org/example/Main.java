package org.example;

import org.example.person.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .name("Karma")
                .age(30)
                .gender("Male")
                .address("123 Main St")
                .build();

        Person miley = new Person
                .Builder()
                .name("Miley")
                .age(23)
                .gender("Female")
                .build();


        System.out.println(miley.toString());
        System.out.println(person.toString());
    }
}