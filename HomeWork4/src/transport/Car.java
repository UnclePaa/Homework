package transport;

import java.lang.String;
import java.util.Scanner;

public class Car extends Land {
    private String bodyType;
    private int landPassengers;

    public Car() {
    }

    public Car(int horsePower, int maxSpeed, double weight, String brand,
               int wheelsNo, double fuelConsump,
               String bodyType, int landPassengers) {
        super(horsePower, maxSpeed, weight, brand, wheelsNo, fuelConsump);
        this.bodyType = bodyType;
        this.landPassengers = landPassengers;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getLandPassengers() {
        return landPassengers;
    }

    public void setLandPassengers(int landPassengers) {
        this.landPassengers = landPassengers;
    }
}

