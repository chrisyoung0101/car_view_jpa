package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    //Save car from input
    public void addCar(Car car) {
        carRepository.save(car);
    }

    //Display List of all Cars
    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>(); //create a new cars list
        carRepository.findAll()//gets all instances from the table in the db by iterating over each one  //findAll() is an iterable so we need to convert it to a list.
                .forEach(cars::add);//iterate over all elements and put each one into the cars list above. For each of the elements in the iterable we are calling the add() method. The (cars::add) part is called a method reference.


        return cars;
    }

//    public List<Car> getAllModels(){
//        return carRepository.getAllMakes();
//    }



}
