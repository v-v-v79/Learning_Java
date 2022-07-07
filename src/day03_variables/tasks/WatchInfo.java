package day03_variables.tasks;

public class WatchInfo {
    public static void main(String[] args) {
        int yearsOfWarranty = 30;
        double price = 150000;
        boolean waterResistant = true;
        boolean isSmart = false;

        System.out.println("\"Rado\" watches:");
        System.out.println("Warranty: " + yearsOfWarranty + " years");
        System.out.printf("Price from: $%.0f\n", price);

        if (waterResistant) {
            System.out.println("Water proof: yes");
        }
        else {
            System.out.println("Water proof: no");
        }
        if (isSmart) {
            System.out.println("Smart Watch: yes");
        }
        else {
            System.out.println("Smart Watch: no");
        }
    }
}
