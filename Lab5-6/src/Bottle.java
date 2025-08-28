/*Write a class for Bottle
include attributes for:
maxVolumeInMilliliters as an integer
currentVolumeInMilliliters as an integer
beverageName as a String

include:
default constructor and
constructor with parameters

include: get and set methods for the attributes - except for a setCurrentVolumeInMilliliters

add a method for drink that accepts an argument for millilitersToDrink
make sure you have enough current volume to drink, otherwise return false
if you have enough current volume to drink, subtract the millilitersToDrink and return true

add a method for fill that accepts a milllitersToFill
ensure won't overfill the max volume ( return false if you will and don't add the millilitersToFill ),
otherwise, add the millilitersToFill to the current Volume */



public class Bottle {
    private int maxVolumeInMilliliters;
    private int currentVolumeInMilliliters;
    private String beverageName;

    public Bottle(int i, String s) {
        this.maxVolumeInMilliliters = 1000;
        this.currentVolumeInMilliliters = 0;
        this.beverageName = "Juice";
    }

    public Bottle(int maxVolumeInMilliliters, int currentVolumeInMilliliters, String beverageName) {
        this.maxVolumeInMilliliters = maxVolumeInMilliliters;
        this.currentVolumeInMilliliters = currentVolumeInMilliliters;
        this.beverageName = beverageName;
    }

    public int getMaxVolumeInMilliliters() {
        return maxVolumeInMilliliters;
    }

    public void setMaxVolumeInMilliliters(int maxVolumeInMilliliters) {
        this.maxVolumeInMilliliters = maxVolumeInMilliliters;
    }

    public int getCurrentVolumeInMilliliters() {
        return currentVolumeInMilliliters;
    }

    public String getBeverageName() {
        return beverageName;
    }

    public void setBeverageName(String beverageName) {
        this.beverageName = beverageName;
    }

    //I asked ChatGpt to give me an argument of a millilitersToDrink for the bottle class
    public boolean drink(int millilitersToDrink) {
        if (currentVolumeInMilliliters < millilitersToDrink) {
            return false;
        } else {
            currentVolumeInMilliliters -= millilitersToDrink;
            return true;
        }
    }
    //I asked ChatGpt to give me an argument of a millilitersToFill for the bottle class
    public boolean fill(int millilitersToFill) {
        int newVolume = currentVolumeInMilliliters + millilitersToFill;

        if (newVolume > maxVolumeInMilliliters) {
            return false;
        } else {
            currentVolumeInMilliliters = newVolume;
            return true;
        }
    }
}