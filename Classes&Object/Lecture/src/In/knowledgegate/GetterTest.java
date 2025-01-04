package In.knowledgegate;

import In.getterssetters.Car;

public class GetterTest {
    public static void main(String[] args) {
        Car car = new Car("Red", "maruti",
                3, 800);
        car.setColor("blue");
        car.setModel("fortuner");//value set
        //car.setFuelLevel(6);
        //  car.setCostOfpurchase(890);
       System.out.printf("%s %s %s %s ",car.getColor(),
               car.getModel(), car.getFuelLevel(), car.getCostOfpurchase());//value return

    }
}





