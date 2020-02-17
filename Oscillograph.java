package Lab1;

public class Oscillograph {
    private int frequencyOfTransmissionInMHz;
    private static int memoryCapacityInKB;
    private String brand;

    //additional private fields
    private int weightInKG;
    String model;

    protected String dateOfManufacture;
    protected int inputRiseTime;

    Oscillograph() {
    }

    Oscillograph(String brand, String model, String dateOfManufacture, int weightInKG) {

        this(brand, model, dateOfManufacture, weightInKG, 0, 0, 0);
    }

    Oscillograph(String brand, String model, String dateOfManufacture, int weightInKG,
                 int inputRiseTime, int memoryCapacityInKB, int frequencyOfTransmissionInMHz) {

        this.brand = brand;
        this.model = model;
        this.dateOfManufacture = dateOfManufacture;
        this.weightInKG = weightInKG;
        this.inputRiseTime = inputRiseTime;
        Oscillograph.memoryCapacityInKB = memoryCapacityInKB;
        this.frequencyOfTransmissionInMHz = frequencyOfTransmissionInMHz;
    }

    public int getWeightInKG() {
        return this.weightInKG;
    }

    public void setWeightInKG(int weightInKG) {

        this.weightInKG = weightInKG;
    }

    public String getModel() {

        return this.model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public static void printStaticMemoryCapacityInKB() {

        System.out.println("Memory capacity: " + memoryCapacityInKB);
    }

    public void printMemoryCapacityInKB() {

        System.out.println("Memory capacity: " + memoryCapacityInKB);
    }

    @Override
    public String toString() {
        printMemoryCapacityInKB();
        return "Brand: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Date of manufacture: " + dateOfManufacture + "\n" +
                "Weight in KG: " + weightInKG + "\n" +
                "Memory of capacity in KB: " + memoryCapacityInKB + "\n" +
                "Input rise time: " + inputRiseTime + "\n" +
                "Frequency of a Transmission in MHz: " + frequencyOfTransmissionInMHz + "\n";
    }

    public void resetValues(String brand_, String model_, String dateOfManufacture_, int weightInKG_,
                     int inputRiseTime_, int frequencyOfTransmissionInMHz_) {
        brand = brand_;
        model = model_;
        dateOfManufacture = dateOfManufacture_;
        weightInKG = weightInKG_;
        inputRiseTime = inputRiseTime_;
        frequencyOfTransmissionInMHz = frequencyOfTransmissionInMHz_;
    }

}
