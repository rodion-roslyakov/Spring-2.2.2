package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private List<Car> cars = new ArrayList<>();

    {

        cars.add(new Car("Geely", "Coolray", 2023));
        cars.add(new Car("Geely", "Monjaro", 2023));
        cars.add(new Car("Geely", "Tugella", 2023));
        cars.add(new Car("Porsche", "911turboS", 2023));
        cars.add(new Car("BMW", "XM", 2023));
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