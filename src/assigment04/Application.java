package assigment04;

import java.util.List;

/** Основной класс, который запускает приложение: сначала создает данные через вызов DBMock.createCars(),
 * а затем, последовательно вызывает методы класса CarController, фильтрующие данные по заданным условиям */
public class Application {

    private static List<Car> cars;
    private static List<Car> filteredCars;
    private static Controller controller;

    public Application() {

    }

    public static void main(String... args) {
        cars = DBMock.createCars();
        controller = new CarController();
        System.out.println("Все машины:");
        System.out.println(cars);
        System.out.println("Машины, отфильтрованные по марке:");
        filteredCars = controller.getCarsByMark("Real", cars);
        System.out.println(filteredCars);
        System.out.println("Машины, отфильтрованные по модели и году выпуска:");
        filteredCars = controller.getCarsByModel("newModel", 1, cars);
        System.out.println(filteredCars);
        System.out.println("Машины, отфильтрованные по году выпуска и цене:");
        filteredCars = controller.getCarsByYear(2000, 99998, cars);
        System.out.println(filteredCars);
    }
}
