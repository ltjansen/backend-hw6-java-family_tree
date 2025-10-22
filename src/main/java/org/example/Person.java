package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> siblings;
    private List<Person> children;
    private List<Pet> pets;

//    constructors
    public Person(String name, String lastName, int age, String sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;

        this.siblings = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pets = new ArrayList<>();
    }

    public Person(String name, String middleName, String lastName, int age, String sex) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;

        this.siblings = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pets = new ArrayList<>();
    }

//    methods
    public void addParents(Person mother, Person father) {
        this.mother = mother;
        this.father = father;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void addSibling(Person sibling) {
        siblings.add(sibling);
    }

//    deze methode nog niet goed uitgewerkt(?)
    public void getGrandChildren() {
        for (Person person: children) {
            person.getChildren();
        }
    }

//    getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void getSiblings() {
        for (int i = 0; i < siblings.size(); i++)
            IO.println(siblings.get(i).name);
    }

    public void getChildren() {
        for (int i = 0; i < children.size(); i++)
            IO.println(children.get(i).name);
    }

    public void getPets() {
        for (int i = 0; i < pets.size(); i++)
            IO.println(pets.get(i).getName());
    }

}
