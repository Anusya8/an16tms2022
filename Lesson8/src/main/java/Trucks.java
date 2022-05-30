public class Trucks extends GroundTransport {

        public Trucks(double horsePower, int maxSpeed, int weight, String carBrand) {
        super(horsePower, maxSpeed, weight, carBrand);
    }

    int maxCapacity;
    double kiloVat;

    public int getMaxCapacity() {
        return int i;
    }

    public Trucks(double horsePower, int maxSpeed, int weight, String carBrand, int maxCapacity) {
        super(horsePower, maxSpeed, weight, carBrand);
        this.maxCapacity = maxCapacity;

    }

    private double countPower() {
        double kiloVat = countPower();
        return horsePower * 0.74;
    }



    class Capacity {
        int i;
            if(i <=maxCapacity)

        {
            System.out.println("Грузовик загружен");
           else
            System.out.print("Вам нужен грузовик побольше");

        }

    }
    @Override
    public String toString() {
        return "Trucks{" +
                "maxCapacity=" + maxCapacity +
                ", kiloVat=" + kiloVat +
                ", horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", carBrand='" + carBrand + '\'' +
                '}';
    }
}