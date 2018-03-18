package assigment05.task02;
import static assigment05.printer.Printer.*;
import java.util.ArrayList;
import java.util.List;

/**2. Создать объект класса Автомобиль, используя класс Колесо. Методы: ехать, заправляться, менять
 колесо, вывести на консоль марку автомобиля.*/

public class Vehicle {

    private List<Wheel> wheels;
    private String model;
    private Integer wheelNumber;

    public Vehicle(String model, Integer wheelNumber) {
        this.model = model;
        this.wheelNumber = wheelNumber;
        wheels = new ArrayList<>();
        for (int i = 0; i < wheelNumber; i++)
            wheels.add(new Wheel(i));
    }

    public void run() {
        print("The car " + model + " is running");
    }

    public void fill() {
        print("The car " + model + " is filling");
    }

    public void changeWheel(Integer wheelNum) {
        wheels.set(wheelNum - 1, new Wheel(wheelNumber));
    }

    public void printCarModel() {
        print(model);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        if (!wheels.equals(vehicle.wheels)) return false;
        if (!model.equals(vehicle.model)) return false;
        return wheelNumber.equals(vehicle.wheelNumber);
    }

    @Override
    public int hashCode() {
        int result = wheels.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + wheelNumber.hashCode();
        return result;
    }

    @Override
    public String toString() {
        String vehicle = "";
        vehicle += "Model name: " + model + "\n";
        vehicle += "Wheel number: " + wheelNumber + "\n";
        vehicle += "Wheels: " + "\n";
        for (Wheel wheel : wheels)
            vehicle += wheel.toString();
        return vehicle;
    }
}
