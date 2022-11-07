public class Truck extends Car implements Competing{

    private Carry carry;
    public enum Carry {
        N1 (null, 3.5),
        N2 (3.5, 12D),
        N3 (12D, null);

        private Double from;
        private Double to;

        Carry(Double from, Double to) {
            this.from = from;
            this.to = to;

        }

        public Double getFrom() {
            return from;
        }

        public void setFrom(Double from) {
            this.from = from;
        }

        public Double getTo() {
            return to;
        }

        public void setTo(Double to) {
            this.to = to;
        }
    }
    public Truck(String brand, String model, float engineDisplacement, Carry carry) {
        super(brand, model, engineDisplacement);
        this.carry = carry;

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
    public void printCarType() {
        if (carry == null){
            System.out.println("Данных по грузовому автомобилю недостаточно");
        } else {
            String from = carry.getFrom() == null ? "" : " от" + carry.getFrom();
            String to = carry.getTo() == null ? "" : " до" + carry.getTo();
            System.out.println("Грузоподъёмность грузового автомобиля " + getBrand() + " " + getModel() + from + to);
        }
    }

    @Override
    public boolean passDiagnostics() {
        return Math.random() > 0.7;
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

    public Carry getCarry() {
        return carry;
    }

    public void setCarry(Carry carry) {
        this.carry = carry;
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль " + getBrand() + " " + getModel() + "объемом двигателя " + getEngineDisplacement();
    }
}
