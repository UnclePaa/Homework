package transport;

import java.lang.String;

public class Transport {
    protected int horsePower;
    protected int maxSpeed;
    protected double weight;
    protected String brand;

    public Transport() {

           }


    public Transport(int horsePower, int maxSpeed, double weight, String brand) {
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }
    public int getHorsePower() {return horsePower;}
    public int getMaxSpeed() {return maxSpeed;}
    public double getWeight() {return weight;}
    public String getBrand() {return brand;}

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public void setMaxSpeed (int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String setBrand(String brand) {
        return brand;
    }

    public String toString() {
        return "Horse power: " + String.valueOf(horsePower);
    }

}







