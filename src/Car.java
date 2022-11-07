import java.util.ArrayList;

public abstract class Car {
    private String brand;
    private String model;
    private final float engineDisplacement;
    private final ArrayList<BusDriver> busDrivers = new ArrayList<>();
    private final ArrayList<PassengerCarDriver> passengerCarDrivers = new ArrayList<>();
    private final ArrayList<TruckDriver> truckDrivers = new ArrayList<>();
    private final ArrayList<Mechanic<?>> mechanics = new ArrayList<>();
    private final ArrayList<Sponsor> sponsors = new ArrayList<>();

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

    public abstract boolean passDiagnostics();

    public void addTruckDriver (TruckDriver truckDriver){
        truckDrivers.add(truckDriver);
    }

    public void addBusDriver (BusDriver busDriver){
        busDrivers.add(busDriver);
    }

    public void addPassengerCarDriver (PassengerCarDriver passengerCarDriver){
        passengerCarDrivers.add(passengerCarDriver);
    }

    public void addMechanic (Mechanic mechanic){
        mechanics.add(mechanic);
    }

    public void addSponsor (Sponsor sponsor){
        sponsors.add(sponsor);
    }


    @Override
    public String toString() {
        return "Автомобиль: " + getBrand() + " " + getModel() + ", \n" +
                "объем двигателя: " + getEngineDisplacement() + ", \n";
    }
}
