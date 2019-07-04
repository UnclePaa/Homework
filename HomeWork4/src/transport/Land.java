package transport;

class Land extends Transport {
    private int wheelsNo;
    private double fuelConsump;

    public Land() {
            }

    Land(int horsePower, int maxSpeed, double weight, String brand, int wheelsNo, double fuelConsump) {
        super(horsePower, maxSpeed, weight, brand);
        this.wheelsNo = wheelsNo;
        this.fuelConsump = fuelConsump;
    }

    public int getWheelsNo() {
        return wheelsNo;
    }
    public void setWheelsNo(int wheelsNo) {
        this.wheelsNo = wheelsNo;
    }

    public double getFuelConsump() {
        return fuelConsump;
    }
    public void setFuelConsump(double fuelConsump) {
        this.fuelConsump = fuelConsump;
    }

    public String toString() {
        return super.toString() + String.valueOf(horsePower);
    }
}