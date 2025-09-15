public class SmartWatch {
    String brand;
    String model;
    int stepsTracked;
    boolean isWaterproof;
    public SmartWatch(String brand, String model, int stepsTracked, boolean isWaterproof){
        this.brand=brand;
        this.model=model;
        this.stepsTracked=stepsTracked;
        this.isWaterproof=isWaterproof;
    }
    void displaySpecs(){
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("StepTracked : "+stepsTracked);
        System.out.println("Waterproof : "+isWaterproof);
    }
    void syncData(){
        System.out.println("Syncing data from "+model);
    }
}
