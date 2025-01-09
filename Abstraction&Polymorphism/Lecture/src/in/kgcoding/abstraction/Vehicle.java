package in.kgcoding.abstraction;

public  abstract class Vehicle implements Transport {
    private int noOfTires;//properties
    public abstract void makeStartSound();

    @Override
    public void getSetGo() {
        System.out.println("going to place");
    }

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires; // constructor

    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }
    public void commute() {
        System.out.println("going...");// method
    }
}
