package by.teachmeskills.robot;

public class ToshibaHand implements IHand{
    int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {

    }

    @Override
    public int getPrice() {
        return price;
    }
}
