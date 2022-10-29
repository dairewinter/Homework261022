public class Truck extends Car implements Competing{
    public Truck(String brand, String model, float engineDisplacement) {
        super(brand, model, engineDisplacement);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовой автомобиль начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовой автомобиль заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобиль выполняет техническую остановку");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга грузового автомобиля");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость грузового автомобиля");
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль " + getBrand() + " " + getModel() + "объемом двигателя " + getEngineDisplacement();
    }
}
