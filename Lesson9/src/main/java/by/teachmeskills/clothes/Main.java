package by.teachmeskills.clothes;

public class Main {
    public static void main(String[] args) {
        Person person1 =new Person( "Alex", "red", "blue", "black");
        System.out.println(person1.putOn());

        Person person2 =new Person( "Nikol", "white", "navy", "brown");
        System.out.println(person2.takeOff());
    }
}
