package COM.VEHICLE;

public class AutomaticDCT extends Transmission {
    private double fifthGear;
    private double sixthGear;
    private double seventhGear;
    private double eightGear;

    public AutomaticDCT(String model, double fifthGear, double sixthGear, double seventhGear, double eightGear) {
        super(model);
        this.fifthGear = fifthGear;
        this.sixthGear = sixthGear;
        this.seventhGear = seventhGear;
        this.eightGear = eightGear;
    }

    public double getFifthGear() {
        return fifthGear;
    }

    public void setFifthGear(double fifthGear) {
        this.fifthGear = fifthGear;
    }

    public double getSixthGear() {
        return sixthGear;
    }

    public void setSixthGear(double sixthGear) {
        this.sixthGear = sixthGear;
    }

    public double getSeventhGear() {
        return seventhGear;
    }

    public void setSeventhGear(double seventhGear) {
        this.seventhGear = seventhGear;
    }

    public double getEightGear() {
        return eightGear;
    }

    public void setEightGear(double eightGear) {
        this.eightGear = eightGear;
    }
    @Override
    public void showSpecs(){
        System.out.println("fifthGear = " + fifthGear);
        System.out.println("sixthGear = " + sixthGear);
        System.out.println("seventhGear = " + seventhGear);
        System.out.println("eightGear = " + eightGear);
        super.showSpecs();
        System.out.println("Transmission Model :"+super.getModel());
        System.out.println("Transmission type : Automatic-DCT");

    }
}
