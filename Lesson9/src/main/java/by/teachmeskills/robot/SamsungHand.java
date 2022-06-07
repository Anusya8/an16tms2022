package by.teachmeskills.robot;

public class SamsungHand implements IHand{
   int price;
    public SamsungHand( int price) {
        this.price =price;
    }
    public SamsungHand (){


    }
    @Override
    public void upHand() {
        System.out.println( " Samsung hands are waving");
    }

    @Override
    public int getPrice() {

        return price;
    }
}
