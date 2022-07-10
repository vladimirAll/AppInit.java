package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.servise.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {

    @Autowired
    private CarServiceImpl carServiceImpl;

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "0") int count, Model model) {

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("KIA", "OPTIMA", "white"));
        carList.add(new Car("NISSAN", "QASHQAI", "blue"));
        carList.add(new Car("KIA", "SPORTAGE", "grey"));
        carList.add(new Car("VOLKSWAGEN", "JETTA", "white"));
        carList.add(new Car("OPEL", "ASTRA", "black"));

        model.addAttribute("car", carServiceImpl.getCarList(carList, count));
        return "cars";
    }

}
