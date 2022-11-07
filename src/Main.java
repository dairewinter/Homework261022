import Exceptions.AuthorisationData;

import java.sql.Driver;
import java.util.*;

public class Main {
    private static final List<String> names = List.of("Ирина", "Юлия", "Марина", "Валерия", "Ксения", "Анна", "Антонина", "Маргарита");
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        PassengerCar kia = new PassengerCar("Kia", "Sportage", 1.6f, PassengerCar.TypeOfBody.PICKUP);
        Bus cursor = new Bus("Cursor", "Liaz", 1.5f, Bus.Capacity.SMALL);
        cursor.addBusDriver(new BusDriver<>("Андрей", "D", 2));
        cursor.addMechanic(new Mechanic<Bus>("Антон", "Антонов", "физ.лицо"));
        cursor.addSponsor(new Sponsor("Андрей", 1600));
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

        List<Car> Car = List.of(kia, cursor, leningrad);


        boolean logPass = AuthorisationData.logAndPassValid("fgfgdfgdf", "adadad", "adadad");
        if(logPass){
            System.out.println("Данные корректны");
        } else {
            System.out.println("Данные некорректны, попробуйте еще раз");
        }


        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        randomFilling(queue1);
        randomFilling(queue2);
        System.out.println("Первая очередь: " + queue1 + "\n" + "Вторая очередь: " + queue2);
        galya("Маргарита", queue1, queue2);
        System.out.println("Первая очередь: " + queue1 + "\n" + "Вторая очередь: " + queue2);
        removeFromQueue(queue1, queue2);
        example();
    }

    private static void example() {
        List<List<String>>biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add((i + j) %2 == 1 ? "●" : "◯");
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void carService(Car... cars){
        for (Car car : cars) {
            if(!car.passDiagnostics()){
                throw new RuntimeException("Автомобиль " + car.getBrand() + " " + car.getModel() + " не прошел диагностику");
            }
        }
    }
    private static void randomFilling(Queue<String> queue){
        int size = RANDOM.nextInt(6);
        for (int i = 0; i < size; i++) {
            queue.offer(names.get(RANDOM.nextInt(names.size())));
        }
    }
    private static void galya (String name, Queue<String> queue1, Queue<String> queue2) {
        if (queue1.size() == 5 && queue2.size() ==5) {
            System.out.println("Позовите Галю!");
        }
    }

    private static void removeFromQueue(Queue<String> queue1, Queue<String> queue2){
        if(RANDOM.nextBoolean()){
            queue1.poll();
        } else {
            queue2.poll();
        }
    }
}