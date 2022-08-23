package COM.VEHICLE;

public class Manual extends Transmission {
    private double fifthGear;
    private double sixthGear;

    public Manual(String model, double fifthGear, double sixthGear) {
        super(model);
        this.fifthGear = fifthGear;
        this.sixthGear = sixthGear;
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
    @Override
    public void showSpecs(){
        System.out.println("Transmission Type   =   Manual");
        super.showSpecs();
        System.out.println("Transmission model Number : "+super.getModel());
        System.out.println("fifthGear = " + fifthGear);
        System.out.println("sixthGear = " + sixthGear);

    }
}
