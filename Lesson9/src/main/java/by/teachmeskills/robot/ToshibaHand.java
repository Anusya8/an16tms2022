package by.teachmeskills.robot;

public class ToshibaHand implements IHand{
    int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println(" Toshiba head is speaking");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
