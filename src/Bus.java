public class Bus extends Car implements Competing{

   private Capacity capacity;
    public enum Capacity {
           TINY(0, 10), SMALL (11, 25), AVERAGE(40, 50), LARGE(60, 80), MAXIMUM(100, 120);

           private int from;
           private int to;

        Capacity(int from, int to) {
            this.from = from;
            this.to = to;
        }

        public int getFrom() {
            return from;
        }

        public void setFrom(int from) {
            this.from = from;
        }

        public int getTo() {
            return to;
        }

        public void setTo(int to) {
            this.to = to;
        }
    }
    public Bus(String brand, String model, float engineDisplacement, Capacity capacity) {
        super(brand, model, engineDisplacement);
        this.capacity = capacity;
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
    public void printCarType() {
        if (capacity == null){
            System.out.println("Данных по автобусу недостаточно");
        } else {
            System.out.println("Вместимость автобуса " + getBrand() + " " + getModel() + " от " + capacity.getFrom() + " до " + capacity.getTo());
        }
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Автобусу " + getBrand() + " " + getModel() + " в диагностика не требуется");
        return true;
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

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() + " " + getModel() + "объемом двигателя " + getEngineDisplacement();
    }
}
