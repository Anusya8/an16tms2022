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
        System.out.println(" Samsung head is speaking");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
