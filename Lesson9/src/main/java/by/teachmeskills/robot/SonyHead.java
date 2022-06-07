package by.teachmeskills.robot;

public class SonyHead implements IHead {
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public void speak() {
        System.out.println("Sony head is speaking");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
