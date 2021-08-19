/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springandswing.business.abstracts;

import com.springandswing.entities.CarPrice;
import com.springandswing.results.DataResult;
import java.util.List;

/**
 *
 * @author seser
 */
public interface CarService {
    
    DataResult<List<CarPrice>> getAll();
    DataResult<List<CarPrice>> getAllSorted();
    //DataResult<CarPrice> getByPrice(int carPrice);
}
