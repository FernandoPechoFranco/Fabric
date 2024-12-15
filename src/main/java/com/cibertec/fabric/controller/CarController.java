package com.cibertec.fabric.controller;

import com.cibertec.fabric.model.Car;
import com.cibertec.fabric.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping("/table")
    public String viewTable(Model model) {
        List<Car> cars = carRepository.findAll();
        model.addAttribute("cars", cars); // Pasa los datos de la tabla a la vista
        return "table"; // Muestra table.html
    }
}
