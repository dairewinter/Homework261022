import Exceptions.AuthorisationData;

public class Main {
    public static void main(String[] args) {
        PassengerCar kia = new PassengerCar("Kia", "Sportage", 1.6f, PassengerCar.TypeOfBody.PICKUP);
        Bus cursor = new Bus("Cursor", "Liaz", 1.5f, Bus.Capacity.SMALL);
        Truck leningrad = new Truck("Leningrad", "Lenin", 1.4f, Truck.Carry.N1);
        PassengerCarDriver petr = new PassengerCarDriver<PassengerCar>("Петров Петр Николаевич", "B", 3);
        TruckDriver anton = new TruckDriver<Truck>("Антонов Антон Антонович", "С", 4);
        BusDriver boris = new BusDriver<Bus>("Борисов Борис Борисович", "D", 2);
        System.out.println(petr + ", \n управляет " + kia + " и будет участвовать в заезде");
        System.out.println(anton + ", \n управляет " + leningrad + " и будет участвовать в заезде");
        System.out.println(boris + ", \n управляет " + cursor + " и будет участвовать в заезде");
        kia.printCarType();
        cursor.printCarType();
        leningrad.printCarType();
        
        carService(kia, cursor, leningrad);


        boolean logPass = AuthorisationData.logAndPassValid("fgfgdfgdf", "adadad", "adadad");
        if(logPass){
            System.out.println("Данные корректны");
        } else {
            System.out.println("Данные некорректны, попробуйте еще раз");
        }
    }

    public static void carService(Car... cars){
        for (Car car : cars) {
            if(!car.passDiagnostics()){
                throw new RuntimeException("Автомобиль " + car.getBrand() + " " + car.getModel() + " не прошел диагностику");
            }
        }
    }
}