public class Printer extends Device{
    String brand;
    public Printer(String name, String brand){
        super(name);
        this.brand=brand;
    }
    @Override
    public void operate(){
        System.out.println("Printer" +name+"by "+brand+" is printing");
    }
}
