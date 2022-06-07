package by.teachmeskills.robot;

public class ToshibaLegs implements ILeg{
    int price;

    public ToshibaLegs(int price) {
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
