/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springandswing.dataAccess;

import com.springandswing.entities.CarPrice;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author seser
 */
public interface CarDao extends JpaRepository<CarPrice,Integer> {
    CarPrice findById(int carId);
    CarPrice getByCarPrice(int carPrice);
    
}
