public class ElectricVehicle {
    private double kilowatHoursInBattery;
    private double maxKilowatHoursInBattery;
    private double kilometersPerKilowatHour;
    private String make;
    private String model;
    private String color;

    public ElectricVehicle(double maxKilowatHoursInBattery, double kilometersPerKilowatHour, String make, String model, String color) {
        this.kilowatHoursInBattery = 0;
        this.maxKilowatHoursInBattery = maxKilowatHoursInBattery;
        this.kilometersPerKilowatHour = kilometersPerKilowatHour;
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public double getKilowatHoursInBattery() {
        return kilowatHoursInBattery;
    }

    public double getMaxKilowatHoursInBattery() {
        return maxKilowatHoursInBattery;
    }

    public double getKilometersPerKilowatHour() {
        return kilometersPerKilowatHour;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean drive(double distance) {
        double maxDistance = this.kilowatHoursInBattery * this.kilometersPerKilowatHour;
        if (distance >= maxDistance) {
            System.out.println("You can't drive that far. Please reduce the distance.");
            return false;
        } else {
            double usedkilowathours = distance / this.kilometersPerKilowatHour;
            this.kilowatHoursInBattery -= usedkilowathours;
            return true;
        }
    }

    public boolean charge(double kwhtocharge) {
        double newkwh = this.kilowatHoursInBattery + kwhtocharge;
        if (newkwh > this.maxKilowatHoursInBattery) {
            System.out.println("You can't charge that much. Please reduce the amount of charge.");
            return false;
        } else {
            this.kilowatHoursInBattery = newkwh;
            return true;
        }
    }
}