public class Civil extends AirTransport{
    public Civil(double horsePower, int maxSpeed, int weight, String carBrand) {
        super(horsePower, maxSpeed, weight, carBrand);}

        int passenger;

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    boolean businessClass;

    private double countPower () {
        double kiloVat = countPower();

        return horsePower * 0.74;
    }
}
