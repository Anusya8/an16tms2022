package main;
import model.Addresss;
import model.Person;

public class Main {
    public static void main(String[]args) {
        Person person = new Person();
        person.name = "Nikolay";
        person.age =12;
        person.height =150;


        Addresss address = new Addresss();
        address.city ="Minsk";
        address.country = "Belarus";
        address.street = "Lobanka";
        person.address =address;
        System.out.println(person);


    }
}
