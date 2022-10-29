public class Main {
    public static void main(String[] args) {
        PassengerCar kia = new PassengerCar("Kia", "Sportage", 1.6f);
        Bus cursor = new Bus("Cursor", "Liaz", 1.5f);
        Truck leningrad = new Truck("Leningrad", "Lenin", 1.4f);
        PassengerCarDriver petr = new PassengerCarDriver<PassengerCar>("Петров Петр Николаевич", "B", 3);
        TruckDriver anton = new TruckDriver<Truck>("Антонов Антон Антонович", "С", 4);
        BusDriver boris = new BusDriver<Bus>("Борисов Борис Борисович", "D", 2);
        System.out.println(petr + ", \n управляет " + kia + " и будет участвовать в заезде");
        System.out.println(anton + ", \n управляет " + leningrad + " и будет участвовать в заезде");
        System.out.println(boris + ", \n управляет " + cursor + " и будет участвовать в заезде");
    }
}