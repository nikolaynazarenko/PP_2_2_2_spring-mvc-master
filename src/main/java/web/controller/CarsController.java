package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.carService.CarService;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping
public class CarsController {

    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String printCars (@RequestParam(name = "count",required = false) Integer count, ModelMap model) {
        if (count != null) {
            List<Car> cars = carService.carList().stream().limit(count).toList();
            model.addAttribute("cars", cars);
        } else {
            model.addAttribute("cars", carService.carList());
        }
        return "cars";
    }
}
