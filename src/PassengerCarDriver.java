public class PassengerCarDriver<B extends PassengerCar & Competing> {
    private final String driverName;
    private String driverLicense;
    private int experience;

    public PassengerCarDriver(String driverName, String driverLicense, int experience) {
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

    public void start(B car) {
        System.out.println("Водитель начинает движение легкового автомобиля");
    }

    public void stop(B car){
        System.out.println("Водитель останавливает легковой автомобиль");
    }

    public void fillTheCar(B car) {
        System.out.println("Водитель заправляет легковой автомобиль");
    }

    @Override
    public String toString() {
        return "Водитель " + getDriverName() + " с водительскими правами класса " + getDriverLicense() +
                " и " + getExperience() + "-летним опытом";
    }
}