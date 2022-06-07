package by.teachmeskills.robot;

public class SonyLegs implements ILeg{
    private int price;
    public SonyLegs (int price){
        this.price = price;
    }
    public SonyLegs(){

    }
    @Override
    public void step() {

    }

    @Override
    public int getPrice() {

        return price;
    }
}
