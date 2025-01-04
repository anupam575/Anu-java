package In.getterssetters;

public class Car {
    private String color;
    private String model;
    private double fuelLevel;
    private long costOfpurchase;

    public Car(String color, String model, double fuelLevel, long costOfpurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfpurchase = costOfpurchase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals("Yellow")) {
            System.out.println("pagal hai kya");
        }
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public long getCostOfpurchase() {
        return costOfpurchase;
    }

    public void setCostOfpurchase(long costOfpurchase) {
        this.costOfpurchase = costOfpurchase;
    }
}
