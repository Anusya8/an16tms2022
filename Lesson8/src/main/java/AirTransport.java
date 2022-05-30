public class AirTransport extends Transport{
    public AirTransport(double horsePower, int maxSpeed, int weight, String carBrand) {
        super(horsePower, maxSpeed, weight, carBrand);}

    int wingSpan;
    int takeOffField;

    public int getWingSpan() {
        return wingSpan;
    }

    public int getTakeOffField() {
        return takeOffField;
    }

    @Override
    public String toString() {
        return "AirTransport{" +
                "wingSpan=" + wingSpan +
                ", takeOffField=" + takeOffField +
                ", horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", carBrand='" + carBrand + '\'' +
                '}';
    }
}
}
