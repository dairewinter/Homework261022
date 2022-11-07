import java.util.ArrayDeque;
import java.util.Queue;

public class Station {
    private final Queue<Car> cars = new ArrayDeque<>();

    private void addCar(Car car){
        cars.offer(car);
    }

    public void add (PassengerCar passengerCar){
        addCar(passengerCar);
    }

    private void addTruck(Truck truck){
        addCar(truck);
    }

    public void maintenance(){
        if(!cars.isEmpty()) {
            Car car = cars.poll();
            car.passDiagnostics();
        }
    }
}
