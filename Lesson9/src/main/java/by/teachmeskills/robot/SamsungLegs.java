package by.teachmeskills.robot;

public class SamsungLegs implements ILeg{

    int price;

    public SamsungLegs(int price) {
        this.price = price;
    }

    @Override
    public void step() {

    }

    @Override
    public int getPrice() {
        return price;
    }
}
