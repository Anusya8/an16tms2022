public class Military extends AirTransport {

    public Military(double horsePower, int maxSpeed, int weight, String carBrand) {
        super(horsePower, maxSpeed, weight, carBrand);}

        int missile;

    public int getMissile() {
        return missile;
        if (missile > 0 ) {
            System.out.println(" Ракета пошла ...");
        }
            else {
            System.out.println("Боеприпасы отсутствуют");

        }

    }

    public boolean isEjector() {
        return ejector;

        ejector = !0 ? "Катапультирование прошло успешно" : "У вас нет такой системы";
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
