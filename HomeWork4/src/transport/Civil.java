package transport;

class Civil extends Air {
    private int airPassengers;
    private boolean businessClass;

    public Civil() {
            }

    Civil(int horsePower, int maxSpeed, double weight, String brand, int wingspan, int airstripLength, int airPassengers, boolean businessClass) {
        super(horsePower, maxSpeed, weight, brand, wingspan, airstripLength);
        this.airPassengers = airPassengers;
        this.businessClass = businessClass;
    }

    public int getAirPassengers() {
        return airPassengers;
    }
    public void setAirPassengers(int airPassengers) {
        this.airPassengers = airPassengers;
    }

    public boolean getBusinessClass() {
        return businessClass;
    }
    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }
}

