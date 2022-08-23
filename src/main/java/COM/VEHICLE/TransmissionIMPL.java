package COM.VEHICLE;

public class TransmissionIMPL {
    public static void main(String[] args) {
        Manual manual = new Manual("MP4",0,0);
        manual.showSpecs();
        System.out.println();
        AutomaticCVT automaticCVT = new AutomaticCVT("CVT6",0.680);
        automaticCVT.showSpecs();
        System.out.println();
        AutomaticDCT automaticDCT = new AutomaticDCT("DCT8",1.285,1.000,0.839,0.667);
        automaticDCT.showSpecs();
        System.out.println();
        AutomaticManualTransmission automaticManualTransmission = new AutomaticManualTransmission("AMTD5",0.630);
        automaticManualTransmission.showSpecs();
        System.out.println();
    }
}