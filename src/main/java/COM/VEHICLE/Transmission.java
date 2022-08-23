package COM.VEHICLE;

public class Transmission {
    private String model;
    private int forwardGear;
    private double firstGear;
    private double secondGear;
    private double thirdGear;
    private double forthGear;

    public Transmission(String model) {
        this.model = model;
        if (model.equals("MP4")) {
            forwardGear = 4;
            firstGear = 2.540;
            secondGear = 1.920;
            thirdGear = 1.510;
            forthGear = 1.000;
        } else if (model.equals("MP5")) {
            forwardGear = 5;
            firstGear = 3.545;
            secondGear = 1.904;
            thirdGear = 1.280;
            forthGear = 0.914;

        } else if (model.equals("MP6")) {
            forwardGear = 6;
            firstGear = 3.010;
            secondGear = 2.070;
            thirdGear = 1.430;
            forthGear = 1.000;

        } else if (model.equals("MD5")) {
            forwardGear = 5;
            firstGear = 3.545;
            secondGear = 1.904;
            thirdGear = 1.233;
            forthGear = 0.914;

        } else if (model.equals("MD6")) {
            forwardGear = 6;
            firstGear = 3.640;
            secondGear = 2.150;
            thirdGear = 1.360;
            forthGear = 1.000;

        } else if (model.equals("AMTP4")) {
            forwardGear = 4;
            firstGear = 2.540;
            secondGear = 1.920;
            thirdGear = 1.510;
            forthGear = 1.000;

        } else if (model.equals("AMTD5")) {
            forwardGear = 5;
            firstGear = 2.950;
            secondGear = 1.940;
            thirdGear = 1.340;
            forthGear = 1.000;

        } else if (model.equals("CVT6")) {
            forwardGear = 6;
            firstGear = 2.631;
            secondGear = 1.440;
            thirdGear = 1.165;
            forthGear = 0.906;

        } else if (model.equals("DCT8")) {
            forwardGear = 8;
            firstGear = 4.714;
            secondGear = 3.143;
            thirdGear = 2.106;
            forthGear = 1.667;
        }


    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getForwardGear() {
        return forwardGear;
    }

    public void setForwardGear(int forwardGear) {
        this.forwardGear = forwardGear;
    }

    public double getFirstGear() {
        return firstGear;
    }

    public void setFirstGear(double firstGear) {
        this.firstGear = firstGear;
    }

    public double getSecondGear() {
        return secondGear;
    }

    public void setSecondGear(double secondGear) {
        this.secondGear = secondGear;
    }

    public double getThirdGear() {
        return thirdGear;
    }

    public void setThirdGear(double thirdGear) {
        this.thirdGear = thirdGear;
    }

    public double getForthGear() {
        return forthGear;
    }

    public void setForthGear(double forthGear) {
        this.forthGear = forthGear;
    }

    public void showSpecs() {
        System.out.println("Forward Gears :" + forwardGear);
        System.out.println("First Gear :" + firstGear);
        System.out.println("Second Gear :" + secondGear);
        System.out.println("Third Gear :" + thirdGear);
        System.out.println("Fourth Gear :" + forthGear);
    }

}
