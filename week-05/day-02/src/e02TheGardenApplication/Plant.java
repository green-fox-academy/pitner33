package e02TheGardenApplication;

public class Plant {
    private double waterAmount;
    private String color;
    private double minWater;
    private double absorbLevel;
    private String type;



    public Plant(String color, String type, double minWater, double absorbLevel) {
        this.waterAmount = 0;
        this.color = color;
        this.minWater = minWater;
        this. absorbLevel = absorbLevel;
        this.type = type;
    }

    public boolean isThirsty() {
        return waterAmount < minWater;
    }

    public void waterPlants(double waterForPlants) {
        waterAmount = absorbLevel * waterForPlants;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMinWater() {
        return minWater;
    }

    public void setMinWater(double minWater) {
        this.minWater = minWater;
    }

    public double getAbsorbLevel() {
        return absorbLevel;
    }

    public void setAbsorbLevel(double absorbLevel) {
        this.absorbLevel = absorbLevel;
    }



    public double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
