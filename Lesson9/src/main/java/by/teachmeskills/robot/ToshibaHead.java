package by.teachmeskills.robot;

public class ToshibaHead implements IHead{
    private int price;
    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {
    }

    @Override
    public void speak() {
        System.out.println(" Toshiba head is speaking");

    }

    @Override
    public int getPrice() {

        return price;
    }
}
