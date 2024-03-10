package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class ServiceCar {


    private final List<Car> carList = Car.carList();


    public List<Car> getCars(int count) {
        if (count <= 0 || count > carList.size()) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }

    public List<Car> getAllCars() {
        return carList;
    }
}

