package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.ServiceCar;

import java.util.List;

@Controller
public class CarController {
    private final ServiceCar serviceCar;

    @Autowired
    public CarController(ServiceCar serviceCar) {
        this.serviceCar = serviceCar;
    }

    @GetMapping(value = "/cars")
    public String getCars(
            Integer count, Model model) {
        List<Car> cars;
        if (count != null && count >= 1 && count <= 4) {
            cars = serviceCar.getCars(count);
        } else {
            cars = serviceCar.getAllCars();
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
