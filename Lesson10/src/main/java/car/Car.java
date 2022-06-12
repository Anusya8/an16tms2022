package car;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

    @Getter
    @Setter
    @ToString
    public class Car {

        private String type;
        private int speed;
        private double cost;

        public Car(String type, int speed, double cost) {

            this.type = type;
            this.speed = speed;
            this.cost = cost;
        }

        public String getType() {
            return type;
        }


        public int getSpeed() {
            return speed;
        }


        public double getCost() {
            return cost;
        }


        public void startEngine() throws CarIsNotStartingException {
            class Random {

                int min = 0;
                int max = 20;
                int diff = max - min;
                Random random = new Random();
                int i = random.nextInt(diff + 1);

                private int nextInt(int i) {
                    return 0;
                }

            if (i % 2 == 0)

                {
                    throw new CarIsNotStartingException("You have got even number, engine won't start ");
                }
            else

                {
                    System.out.println("The car " + type + " is ready to go");
                }
            }


        }
    }

