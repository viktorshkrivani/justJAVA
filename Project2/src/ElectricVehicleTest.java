import org.junit.Test;
import static org.junit.Assert.*;

public class ElectricVehicleTest {

    @Test
    public void testDrive() {
        ElectricVehicle electricvehicle = new ElectricVehicle(80, 5, "Tesla", "Model S", "Red");

        // Test that u can't drive
        assertFalse(electricvehicle.drive(10));
        assertEquals(0, electricvehicle.getKilowatHoursInBattery(), 0.001);

        electricvehicle.charge(60);
        int drive = 10;
        double expected = 60 - drive / 5;

        // Test that driving exactly to the battery's limit works as expected
        assertTrue(electricvehicle.drive(drive));
        assertEquals(expected, electricvehicle.getKilowatHoursInBattery(), 0.001);

    }

    @Test
    public void testCharge() {
        ElectricVehicle electricvehicle = new ElectricVehicle(100, 5, "Tesla", "Model S", "Red");

        // Test that charging within the battery's limit works as expected
        assertTrue(electricvehicle.charge(20));
        assertEquals(20.0, electricvehicle.getKilowatHoursInBattery(), 0.001);

        // Test that charging more than the battery's limit fails and leaves the battery unchanged
        assertFalse(electricvehicle.charge(1000));
        assertEquals(20.0, electricvehicle.getKilowatHoursInBattery(), 0.001);

        // Test that charging exactly to the battery's limit works as expected
        assertTrue(electricvehicle.charge(80));
        assertEquals(100.0, electricvehicle.getKilowatHoursInBattery(), 0.001);
    }
}