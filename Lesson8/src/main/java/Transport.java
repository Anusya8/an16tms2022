public class Transport {

    double horsePower;
    int maxSpeed;
    int weight;
    String carBrand;

    public Transport() {

    }

    public double getHorsePower() {
        return horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public Transport(double horsePower, int maxSpeed, int weight, String carBrand) {
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.carBrand = carBrand;
    }


    public String info() {
        return null;
    }
}

