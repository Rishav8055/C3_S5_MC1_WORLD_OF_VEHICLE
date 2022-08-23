package COM.VEHICLE;

public class AutomaticManualTransmission extends Transmission {
    private double fifthGear;

    public AutomaticManualTransmission(String model, double fifthGear) {
        super(model);
        this.fifthGear = fifthGear;
    }

    public double getFifthGear() {
        return fifthGear;
    }

    public void setFifthGear(double fifthGear) {
        this.fifthGear = fifthGear;
    }
    @Override
    public void showSpecs(){
        System.out.println("Transmission Type : Automatic Manual");
        super.showSpecs();
        System.out.println("fifthGear = " + fifthGear);
        System.out.println("Transmission model Number : "+super.getModel());
    }
}
