import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the maximum number of kw hours in the battery:");
        double maxKilowatHoursInBattery = scanner.nextDouble();

        System.out.println("Enter the number of km the vehicle can travel per kwh:");
        double kilometersPerKilowatHour = scanner.nextDouble();

        System.out.println("Company Car:");
        String make = scanner.next();

        System.out.println("Vehicle model:");
        String model = scanner.next();

        System.out.println("Vehicle color:");
        String color = scanner.next();

        ElectricVehicle electricvehicle = new ElectricVehicle(maxKilowatHoursInBattery, kilometersPerKilowatHour, make, model, color);

        while (true) {
            System.out.println("What would you like to do? (Chose one number)");
            System.out.println("1. Check battery status");
            System.out.println("2. Drive the vehicle");
            System.out.println("3. Charge the vehicle");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Battery status: " + electricvehicle.getKilowatHoursInBattery() + " out of " + electricvehicle.getMaxKilowatHoursInBattery() + " kwh");
                    break;
                case 2:
                    System.out.println("Distance you would like to drive in km:");
                    double distance = scanner.nextDouble();

                    boolean toofar = electricvehicle.drive(distance);

                    if (toofar) {
                        System.out.println("You can't drive due to insufficient battery.");
                    } else {
                        System.out.println("You drove " + distance + " km.");
                    }
                    break;
                case 3:
                    System.out.println("Enter the number of kwh you would like to charge:");
                    double charge = scanner.nextDouble();

                    boolean overcharge = electricvehicle.charge(charge);

                    if (overcharge) {
                        System.out.println("You charged the vehicle with " + charge + " kwh.");
                    } else {
                        System.out.println("You did not charge the vehicle due to overcharging.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}