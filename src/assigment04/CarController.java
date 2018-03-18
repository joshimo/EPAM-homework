package assigment04;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** Класс-контроллер, который будет фильтровать список автомобилей по указанным параметрам и возвращать список машин,
 * удовлетворяющих условию*/
public class CarController implements Controller {

    /** Метод возвращает список автомобилей заданной марки */
    @Override
    public List<Car> getCarsByMark(String mark, List<Car> cars) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars)
            if (car.getMark().equals(mark))
                filteredCars.add(car);
        return filteredCars;
    }

    /** Метод возвращает @return список автомобилей заданной модели,
     * со сроком эксплуатации более указанной */
    @Override
    public List<Car> getCarsByModel(String model, int age, List<Car> cars) {
        Date date = new Date();
        Integer currentYear = date.getYear() + 1900;
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars)
            if (car.getModel().equals(model) && ((currentYear - car.getYear()) > age))
                filteredCars.add(car);
        return filteredCars;
    }

    /** Метод возвращает список автомобилей заданного года выпуска,
     * цена которых более указанной */
    @Override
    public List<Car> getCarsByYear(int year, int price, List<Car> cars) {
        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars)
            if ((car.getYear() == year) && (car.getPrice() > price))
                filteredCars.add(car);
        return filteredCars;
    }
}
