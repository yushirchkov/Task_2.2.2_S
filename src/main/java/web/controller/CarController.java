package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.ServiceCar;

import java.util.List;

@Controller
public class CarController {

    private final ServiceCar serviceCar;


    public CarController(ServiceCar serviceCar) {
        this.serviceCar = serviceCar;
    }

    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(value = "count", required = false) Integer count, Model model){
        model.addAttribute("cars", serviceCar.getCars(count));
        return "cars";
    }
}
