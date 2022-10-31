public abstract class Car {
    private String brand;
    private String model;
    private final float engineDisplacement;

    public Car(String brand, String model, float engineDisplacement) {
        this.brand = Validation.validOrDefault(brand, "автобус");
        this.model = Validation.validOrDefault(model, "Курсор");
        this.engineDisplacement = Math.max(engineDisplacement, 0);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = Validation.validOrDefault(brand, "автобус");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = Validation.validOrDefault(model, "Курсор");
    }

    public float getEngineDisplacement() {
        return engineDisplacement;
    }

    public abstract void startMoving();
    public abstract void stopMoving();

    public abstract void printCarType();

    @Override
    public String toString() {
        return "Автомобиль: " + getBrand() + " " + getModel() + ", \n" +
                "объем двигателя: " + getEngineDisplacement() + ", \n";
    }
}
