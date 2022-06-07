package by.teachmeskills.robot;

public class SamsungHead implements IHead{
   private int price;

   public SamsungHead(int price) {
       this.price = price;

    }

    public SamsungHead() {
    }

    @Override
    public void speak() {

    }

    @Override
    public int getPrice() {
        return price;
    }
}
