package by.teachmeskills.clothes;

public class Person implements IJacket, IPants, IShoes {
    String name;
    String jacket;
    String pants;
    String shoes;


    public Person(String name, String jacket, String pants, String shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }
    public String getName() {
        return name;
    }

    public String getJacket() {
        return jacket;
    }

    public String getPants() {
        return pants;
    }

    public String getShoes() {
        return shoes;
    }

    @Override
    public String putOn(){
     String putOn = jacket + pants + shoes;
        System.out.println( " I am wearing " + jacket  +" jacket " + pants + " pants " + shoes + " shoes ");
        return null;
    }


    @Override
    public String takeOff() {
        String takeOff = jacket + pants + shoes;
        System.out.println( " I am  not wearing " + jacket +" jacket " + pants + " pants " + shoes + " shoes ");
    return null;
    }

    }

