public class Bus extends Car implements Competing{
    public Bus(String brand, String model, float engineDisplacement) {
        super(brand, model, engineDisplacement);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобу выполняет техническую остановку");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга автобуса");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость автобуса");
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() + " " + getModel() + "объемом двигателя " + getEngineDisplacement();
    }
}
