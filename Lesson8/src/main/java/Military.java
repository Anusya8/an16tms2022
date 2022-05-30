public class Military extends AirTransport {

    public Military(double horsePower, int maxSpeed, int weight, String carBrand) {
        super(horsePower, maxSpeed, weight, carBrand);}

        int missile;

    public int getMissile() {
        return missile;
    }

    public boolean isEjector() {
        return ejector;
    }

    boolean  ejector;

    private double countPower () {
        double kiloVat = countPower();

        return horsePower * 0.74;
    }

    @Override
    public String toString() {
        return "Military{" +
                "missile=" + missile +
                ", ejector=" + ejector +
                ", wingSpan=" + wingSpan +
                ", takeOffField=" + takeOffField +
                ", horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", carBrand='" + carBrand + '\'' +
                '}';
    }
}
