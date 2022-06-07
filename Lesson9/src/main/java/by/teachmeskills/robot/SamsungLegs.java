package by.teachmeskills.robot;

public class SamsungLegs implements ILeg{

    int price;

    public SamsungLegs(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Samsung legs are walking");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
