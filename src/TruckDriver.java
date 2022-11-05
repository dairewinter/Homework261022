public class TruckDriver<C extends Truck & Competing> {
    private final String driverName;
    private String driverLicense;
    private int experience;

    public TruckDriver(String driverName, String driverLicense, int experience) {
        this.driverName = Validation.validOrDefault(driverName, "Имя не указано");
        setDriverLicense(driverLicense);
        this.experience = Math.max(experience, 0);
    }

    public String getDriverName() {
        return driverName;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        if (driverLicense == null){
            throw new IllegalArgumentException("Необходимо указать тип прав");
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = Math.max(experience, 0);
    }

    public void start(C car) {
        System.out.println("Водитель начинает движение грузового автомобиля");
    }

    public void stop(C car){
        System.out.println("Водитель останавливает грузовой автомобиль");
    }

    public void fillTheCar(C car) {
        System.out.println("Водитель заправляет грузовой автомобиль");
    }

    @Override
    public String toString() {
        return "Водитель " + getDriverName() + " с водительскими правами класса " + getDriverLicense() +
                " и " + getExperience() + "-летним опытом";
    }
}