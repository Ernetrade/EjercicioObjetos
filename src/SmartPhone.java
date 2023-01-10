public class SmartPhone extends SmartDivice{
    
    boolean cover;

    public SmartPhone(){
        
    }

    public SmartPhone(String software, double pulgadas, double version, boolean cargador, boolean cover) {
        super(software, pulgadas, version, cargador);
        this.cover = cover;
    }
}
