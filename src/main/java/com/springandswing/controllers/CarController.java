/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springandswing.controllers;

import com.springandswing.business.abstracts.CarService;
import com.springandswing.entities.CarPrice;
import com.springandswing.results.DataResult;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author seser
 */
@RestController
@RequestMapping("/api/cars")
public class CarController {
    
    private CarService carService;
    
    @Autowired
    public CarController(CarService carService){
        super();
        this.carService=carService;
    }
    @GetMapping("/priceandid")
    public DataResult<List<CarPrice>> getAll()
    {
        return carService.getAll();
    }    
    

    
}
