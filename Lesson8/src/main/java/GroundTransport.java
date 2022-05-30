public class GroundTransport extends Transport{


    public GroundTransport(double horsePower, int maxSpeed, int weight, String carBrand) {
        super(horsePower, maxSpeed, weight, carBrand);
    }
       int numberOfWeels;

    public int getNumberOfWeels() {
        return numberOfWeels;
    }

    public int getPetrolConsumption() {
        return petrolConsumption;
    }

    int petrolConsumption;

    @Override
    public String toString() {
        return "GroundTransport{" +
                "numberOfWeels=" + numberOfWeels +
                ", petrolConsumption=" + petrolConsumption +
                ", horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", carBrand='" + carBrand + '\'' +
                '}';
    }
}
