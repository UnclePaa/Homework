package transport;

class Air extends Transport {
    private int wingspan;
    private int airstripLength;

    public Air() {
            }

    public Air(int horsePower, int maxSpeed, double weight, String brand, int wingspan, int airstripLength) {
        super(horsePower, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.airstripLength = airstripLength;
    }

    public int getWingspan() {
        return wingspan;
    }
    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getAirstripLength() {
        return airstripLength;
    }
    public void setAirstripLength(int wingspan) {
        this.wingspan = wingspan;
    }

}

