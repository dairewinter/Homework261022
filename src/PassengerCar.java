public class PassengerCar extends Car implements Competing{
    public PassengerCar(String brand, String model, float engineDisplacement) {
        super(brand, model, engineDisplacement);
    }

    @Override
    public void startMoving() {
        System.out.println("Легковой автомобиль начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Легковой автомобиль заканчивает движение");
    }


    @Override
    public void pitStop() {
        System.out.println("Легковой автомобиль выполняет техническую остановку");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга легкового автомобиля");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость легкового автомобиля");
    }

    @Override
    public String toString() {
        return "Легковой автомобиль " + getBrand() + " " + getModel() + "объемом двигателя " + getEngineDisplacement();
    }
}
