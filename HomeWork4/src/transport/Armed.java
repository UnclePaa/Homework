package transport;

class Armed extends Air {
    private boolean ejection;
    private int missiles;

    public Armed() {

    }

    Armed(int horsePower, int maxSpeed, double weight, String brand,
          int wingspan, int airstripLength,
          boolean ejection, int missiles) {
        super(horsePower, maxSpeed, weight, brand, wingspan, airstripLength);
        this.ejection = ejection;
        this.missiles = missiles;
    }

    public boolean getEjection() {
        return ejection;
    }

    public void setEjection(boolean ejection) {
        this.ejection = ejection;
    }

    public int getMissiles() {
        return missiles;
    }

    public void setMissiles(int missiles) {
        this.missiles = missiles;
    }
}