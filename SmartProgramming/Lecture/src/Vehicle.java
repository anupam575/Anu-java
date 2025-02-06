abstract class Vehicle {
    abstract void start ();// does not create body implementation details hide
}
class Car  extends Vehicle {
    @Override
    void start() {
        System.out.println("car starts with key"); // body creation
    }
}
    //void start ()


    class Scooter extends Vehicle {


        @Override
        void start() {
            System.out.println("scooter starts with kick");

        }


        public static void main(String[] args) {
            Car c = new Car();
            c.start();
            Scooter s = new Scooter();
            s.start();

        }
    }





