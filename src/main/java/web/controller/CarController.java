package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;



@Controller
public class CarController {

    @Autowired
    private CarServiceImpl carServiceImpl;

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "0") int count, Model model) {

        model.addAttribute("car", carServiceImpl.getCarList(count));
        return "cars";
    }

}
