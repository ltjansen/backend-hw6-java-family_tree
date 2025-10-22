package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {

    Person lukas = new Person("Lukas", "Jansen", 31, "male");
    Pet pet = new Pet("Figo", 13, "Schnauzer");
    Person judith = new Person("Judith", "Jansen", 33, "female");
    Person robin = new Person("Robin", "Jansen", 28, "female");

        lukas.addSibling(judith);
        lukas.addSibling(robin);
        lukas.getSiblings();


    }
}
