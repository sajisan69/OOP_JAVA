class Bicycle extends Transport {
    int gearCount;
    Bicycle(String type, int gearCount) {
        super(type);
        this.gearCount = gearCount;
    }
    @Override
    void move() {
        super.move();
        System.out.println("Bicycle with "+gearCount+" gears is cycling");
    }
}