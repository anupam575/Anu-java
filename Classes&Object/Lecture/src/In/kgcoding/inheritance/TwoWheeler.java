package In.kgcoding.inheritance;

public class TwoWheeler extends Vehicle {

    TwoWheeler() {
        setNumberOfTires(2);
        numberOfTires = 4;
    }
    public void balance() {
        System.out.println("i am balncing on two tires");
    }

}
