package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceCar {


    private final List<Car> carList = Car.carList();


    public List<Car> getCars(Integer count) {
        List<Car> list = new ArrayList<>();
        if (count != null && count >= 1 && count <= 4) {
            for (int i = 0; i < count; i++) {
                list.add(carList.get(i));
            }
        } else {
            list = carList;
        }
        return list;


    }
}

