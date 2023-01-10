public class SmartWatch extends SmartDivice{
    
    boolean pulsera;

    public SmartWatch(){
        
    }

    public SmartWatch(String software, double pulgadas, double version, boolean cargador, boolean pulsera) {
        super(software, pulgadas, version, cargador);
        this.pulsera = pulsera;
    }


}
