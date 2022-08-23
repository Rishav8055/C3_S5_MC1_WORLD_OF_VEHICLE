package COM.VEHICLE;

public class AutomaticCVT extends Transmission {
    private double fifthGear;

    public AutomaticCVT(String model, double fifthGear) {
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
        System.out.println("fifthGear = " + fifthGear);
        super.showSpecs();
        System.out.println("Transmission Type : Automatic-CVT");
        System.out.println("Transmission model:"+super.getModel());

    }
}
