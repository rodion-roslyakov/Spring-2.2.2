package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private List<Car> cars = new ArrayList<>();

    {
        Car car1 = new Car("Geely", "Coolray", 2023);
        Car car2 = new Car("Geely", "Monjaro", 2023);
        Car car3 = new Car("Geely", "Tugella", 2023);
        Car car4 = new Car("Porsche", "911turboS", 2023);
        Car car5 = new Car("BMW", "XM", 2023);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }

    @Override
    public List<Car> getCars(int count) {
        if (count > 0) {
            if (count > 5) {
                return cars;
            }
            return cars.subList(0, count);
        }
        return null;
    }
}