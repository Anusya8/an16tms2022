public class GroundTransport extends Transport{


    public GroundTransport(double horsePower, int maxSpeed, int weight, String carBrand) {
        super(horsePower, maxSpeed, weight, carBrand);
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setPetrolConsumption(int petrolConsumption) {
        this.petrolConsumption = petrolConsumption;
    }

    int numberOfWheels;


    int petrolConsumption;

    @Override
    public String toString() {
        return "GroundTransport{" +
                "numberOfWeels=" + numberOfWheels +
                ", petrolConsumption=" + petrolConsumption +
                ", horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", carBrand='" + carBrand + '\'' +
                '}';
    }
}
