package Lab1;

public class oscillographManufacturer {
    public static void main(String[] args) {
        Oscillograph firstDevice = new Oscillograph();
        Oscillograph secondDevice = new Oscillograph("Marshall", "MW-52", "24-03-2015", 2);
        Oscillograph thirdDevice = new Oscillograph("Zhukk", "Nova", "10-10-2019", 1,
                27, 228, 321);

        System.out.println("-------- first oscillograph ---------");
        System.out.println(firstDevice);
        System.out.println("------- second oscillograph --------");
        System.out.println(secondDevice);
        System.out.println("-------- third oscillograph --------");
        System.out.println(thirdDevice);

        System.out.println("---------- static method -----------: ");
        Oscillograph.printStaticMemoryCapacityInKB();
        System.out.println("---------- non-static method ---------: ");
        firstDevice.printMemoryCapacityInKB();
        System.out.println();

        Oscillograph[] arrayOfOscillographs = new Oscillograph[4];
        int iterator = 0;
        do {
            arrayOfOscillographs[iterator] = new Oscillograph();
            iterator++;
        } while (iterator<4);

        for (Oscillograph itElevator: arrayOfOscillographs) {
            System.out.println(itElevator);
        }
    }
}
