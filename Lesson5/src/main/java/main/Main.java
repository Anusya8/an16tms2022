package main;

import model.Addresss;
import model.Person;
import sun.jvm.hotspot.debugger.*;

public class Main {
    public void main(String[] args) {
        Person person = new Person();
        person.name = "Nikolay";
        person.age = 12;
        person.height = 150;


        Addresss address = new Addresss();
        address.city = "Minsk";
        address.country = "Belarus";
        address.street = "Lobanka";


    }

}

