public class Scanner extends Device{
    int resolution;
    public Scanner(String name, int resolution){
        super(name);
        this.resolution=resolution;
    }
    @Override
    public void operate(){
        System.out.println("Scanner "+name+" scanning at "+resolution);
    }
}
