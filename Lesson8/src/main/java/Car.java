public class Car extends GroundTransport {

    public Car(double horsePower, int maxSpeed, int weight, String carBrand) {
        super(horsePower, maxSpeed, weight, carBrand);
    }

    public int Car(double horsePower, int maxSpeed, int weight, String carBrand) {
        return maxSpeed;
    }

    int passenger;


    public int getPassenger() {
        return passenger;
    }

    public String getCarType() {
        return carType;
    }

    String carType;
    double passingTime;
    double gas;

    public double getGas() {
        return gas;
    }


    private double countPower() {
        double kiloVat = countPower();
        return horsePower * 0.74;
    }

    private double getPassingTime() {
        return passingTime;
    }

        private double gasOnMaxSpeed () {
        return passingKm() / gas;
            System.out.println("За время " + passingTime + "автомобиль," + " " + carType + " двигаясь с максимальной скоростью" + maxSpeed + " " + "пройдет" + " " + passingTime + " " + "и израсходует" + gasOnMaxSpeed + " " + " литров топлива.");
                    }

        private double passingKm () {
            return maxSpeed / passingTime;
        }

        @Override
        public String toString () {
            return "Car{" +
                    "passenger=" + passenger +
                    ", carType='" + carType + '\'' +
                    ", passingTime=" + passingTime +
                    ", gas=" + gas +
                    ", horsePower=" + horsePower +
                    ", maxSpeed=" + maxSpeed +
                    ", weight=" + weight +
                    ", carBrand='" + carBrand + '\'' +
                    '}';
        }
    }


