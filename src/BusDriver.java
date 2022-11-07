public class BusDriver<D extends Bus & Competing> {
    private final String driverName;
    private String driverLicense;
    private int experience;

    public BusDriver(String driverName, String driverLicense, int experience) {
        this.driverName = Validation.validOrDefault(driverName, "Имя не указано");
        this.driverLicense = driverLicense;
        this.experience = Math.max(experience, 0);
    }

    public String getDriverName() {
        return driverName;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = Math.max(experience, 0);
    }

    public void start(D car) {
        System.out.println("Водитель начинает движение автобуса");
    }

    public void stop(D car){
        System.out.println("Водитель останавливает автобус");
    }

    public void fillTheCar(D car) {
        System.out.println("Водитель заправляет автобус");
    }

    @Override
    public String toString() {
        return "Водитель " + getDriverName() + " с водительскими правами класса " + getDriverLicense() +
                " и " + getExperience() + "-летним опытом";
    }
}