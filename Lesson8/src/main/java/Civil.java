public class Civil extends AirTransport{
    public Civil(double horsePower, int maxSpeed, int weight, String carBrand) {
        super(horsePower, maxSpeed, weight, carBrand);}
    int passenger1;
        public void setPassenger(int passenger1) {
        this.passenger1 = passenger1;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    boolean businessClass;

    private double countPower () {
        double kiloVat = countPower();

        return horsePower * 0.74;
    }
    class PassengerOnBoard {
        public int getPassengerOnBoard() {
            return 0;
        }

        private int passengerOnBoard (int passengerOnBoard){
        int i  = passengerOnBoard;
            if(i < passenger1);

            System.out.println("Еще есть свободные места");

            if (i == passenger1)

            System.out.print("Все места заняты");

           else
            System.out.print("Свободных мест больше нет, вам нужен другой самолет");

        }
        @Override
        public String toString() {
            return "Civil{" +
                    "businessClass=" + businessClass +
                    ", wingSpan=" + wingSpan +
                    ", takeOffField=" + takeOffField +
                    ", horsePower=" + horsePower +
                    ", maxSpeed=" + maxSpeed +
                    ", weight=" + weight +
                    ", carBrand='" + carBrand + '\'' +
                    '}';
        }

        private class passenger1 {
        }
    }
}
