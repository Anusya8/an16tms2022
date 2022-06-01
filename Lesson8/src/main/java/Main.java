public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Transport transport = new Transport(207, 230, 1442, "Volkswagen Golf");
        System.out.println(transport.info());
        GroundTransport groundTransport = new GroundTransport(300, 200, 3000, "Volvo");
        int numberOfWheels = 4;
        int petrolConsumption = 10;
        System.out.println(groundTransport.toString());
        AirTransport airTransport = new AirTransport(100000, 11000, 16300, "Су-27");
        int wingSpan = 15;
        int takeOffField = 600;
        System.out.println(airTransport.toString());
        Car car = new Car(109, 175, 1252, "Nissan");
        int passenger = 5;
        String carType = "Juke";
        double passingTime = 15;
        double gas = 6;
        System.out.println(car.toString());
        Trucks trucks = new Trucks(120, 160, 3500, "GAZ");
        int maxCapacity = 1840;
        int i = (int) Math.random();
        System.out.println(trucks.toString());
        Civil civil = new Civil(111000, 850, 47000, "Ту-134");
        int passenger1 = 76;
        System.out.println(civil.toString());
        Military military = new Military(1055, 2450, 10900, "Миг-29");
        int missile = 6;
        System.out.println(military.toString());

    }
}



