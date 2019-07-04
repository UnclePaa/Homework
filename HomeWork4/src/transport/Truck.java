package transport;

class Truck extends Land {
    private int capacity;

    public Truck() {
            }

    Truck(int horsePower, int maxSpeed, double weight, String brand,
          int wheelsNo, double fuelConsump, int capacity) {
        super(horsePower, maxSpeed, weight, brand, wheelsNo, fuelConsump);
        this.capacity = capacity;
    }


    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}