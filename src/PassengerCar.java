public class PassengerCar extends Car implements Competing{

    private TypeOfBody typeOfBody;

    public enum TypeOfBody {
        SEDAN ("Седан"), HATCHBACK ("Хетчбек"), COUPE ("Купе"), UNIVERSAL ("Универсал"), SUV ("Внедорожник"), CROSSOVER ("Кроссовер"), PICKUP ("Пикап"), VAN ("Фургон"), MINIVAN ("Минивэн");

        private final String name;

        TypeOfBody(String name) {
            this.name = name;
        }
    }
    public PassengerCar(String brand, String model, float engineDisplacement, TypeOfBody typeOfBody) {
        super(brand, model, engineDisplacement);
        this.typeOfBody = typeOfBody;
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
    public void printCarType() {
        if (typeOfBody == null){
            System.out.println("Данных по легковому автомобилю недостаточно");
        } else {
            System.out.println("Тип кузова легкового автомобиля " + getBrand() + " " + getModel() + " : " + typeOfBody);
        }
    }

    @Override
    public boolean passDiagnostics() {
        return Math.random() > 0.5;
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

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    public String toString() {
        return "Легковой автомобиль " + getBrand() + " " + getModel() + "объемом двигателя " + getEngineDisplacement();
    }
}
