import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//I used the hard coding for both "Drink" and "Fill" but at the tutoring I showed the code and he waned
//to me using a different method with the values at first and I decided to leave them both here, they are both with
//different methods
class BottleTest1 {


    @Test
    void drink() {
        int max = 1000;
        int current = 500;
        int drink = 200;
        int expected = current -drink;


        Bottle bottle = new Bottle(max,current, "Juice");

        boolean resultdrink1 = bottle.drink(drink);
        assertEquals(expected, bottle.getCurrentVolumeInMilliliters());
        assertTrue(resultdrink1);


        boolean resultdrink2 = bottle.drink(current);
        assertFalse(resultdrink2);
        assertEquals(expected, bottle.getCurrentVolumeInMilliliters());
    }

    @Test
    void fill() {
        Bottle bottle = new Bottle(1000, 500, "Juice");

        boolean resultfill1 = bottle.fill(200);
        assertTrue(resultfill1);
        assertEquals(700, bottle.getCurrentVolumeInMilliliters());

        boolean resultfill2 = bottle.fill(1000);
        assertFalse(resultfill2);
        assertEquals(700, bottle.getCurrentVolumeInMilliliters());
    }
}