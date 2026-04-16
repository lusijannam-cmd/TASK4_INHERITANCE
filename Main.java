import java.util.List;

public class Main {
    public static void main(String[] args) {
        HardwareRepository repo = new HardwareRepository();
        List<Hardware> masterList = repo.getAllHardware();


        System.out.println("ID\tBrand\t\tInterpretation");
        System.out.println("---------------------------------------");
        for (Hardware h : masterList) {
            System.out.println(h.getId() + "\t" + h.getBrand() + "\t\t" + h.interpretSpec());
        }

        System.out.println("\n--- Laptop and Phone Inventory ---");


        String countedSpecs = "";

        for (Hardware h : masterList) {

            String currentLabel = h.getSpec() + (h instanceof Laptop ? "GB Laptop" : "MP Phone");

            if (!countedSpecs.contains(currentLabel)) {
                int count = 0;


                for (Hardware search : masterList) {
                    String searchLabel = search.getSpec() + (search instanceof Laptop ? "GB Laptop" : "MP Phone");
                    if (currentLabel.equals(searchLabel)) {
                        count++;
                    }
                }


                System.out.println("Total number of " + currentLabel + "s: " + count);


                countedSpecs += currentLabel + ",";
            }
        }
    }
}