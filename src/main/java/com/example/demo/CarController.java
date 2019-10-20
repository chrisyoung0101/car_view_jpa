package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class CarController {


    //make available an instance of CarService
    @Autowired
    private CarService carService;

    @Autowired
    private CarRepository carRepository;


    //PRESENT VIEW car.html
    @GetMapping("/car")
    public String carForm(Model model) {
        //String attributeName = "car";
        //Object attributeValue = new Car();
        //create a new Car object and set it to the model object this in turn exposes the new Car() to the view
        //note that Thymeleaf attributes correspond to the Car Class fields
        model.addAttribute("car", new Car());
        //carService.getAllCars() resolves to an ArrayList of car objects.
        //we make this ArrayList an attribute on model and give the attribute a name called "cars"

        model.addAttribute("cars", carService.getAllCars());
        return "car";
    }


    //POST TO DATABASE
    @PostMapping("/car")
    public String carSubmit(@ModelAttribute Car car) {
        //user submits form.  input data gets POSTed to database aka saved
        carService.addCar(car);
        //need redirect to allow the input form and table to work on single view page
        return "redirect:/car";
    }


    //list.html
    @GetMapping("/list")
    public String carMakeList(Model model){
        model.addAttribute("list", carRepository.getAllMakes());

        return "list";
    }


}
