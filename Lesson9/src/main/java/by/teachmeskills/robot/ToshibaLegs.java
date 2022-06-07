package by.teachmeskills.robot;

public class ToshibaLegs implements ILeg{
    int price;

    public ToshibaLegs(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println(" Toshiba legs are walking");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
