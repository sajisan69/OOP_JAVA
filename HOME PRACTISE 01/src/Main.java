public class Main {
    public static void main(String[] args) {
        Device[] devices=new Device[4];
        Device device=new Device("PHONE");
        Printer printer=new Printer("BASIC", "HP");
        Scanner scanner=new Scanner("DELL", 144);
        Scanner scanner1=new Scanner("ASUS", 100);
        devices[0]=device;
        devices[1]=printer;
        devices[2]=scanner;
        devices[3]=scanner1;
        for(Device what: devices){
            what.operate();
        }
    }
}