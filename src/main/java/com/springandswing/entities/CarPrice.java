/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springandswing.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author seser
 */
@Table(name="carprice")
@Entity
public class CarPrice {
    
    @Id
    @Column(name="car_id")
    private int carId;
    
    @Column(name="car_price")
    private int carPrice;
  
    
    public CarPrice(){
        
    }
    
    public CarPrice(int carId,int carPrice){
        super();
        this.carId=carId;
        this.carPrice=carPrice;
    }

    /**
     * @return the carId
     */
    public int getCarId() {
        return carId;
    }

    /**
     * @param carId the carId to set
     */
    public void setCarId(int carId) {
        this.carId = carId;
    }

    /**
     * @return the carPrice
     */
    public int getCarPrice() {
        return carPrice;
    }

    /**
     * @param carPrice the carPrice to set
     */
    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }
    
    
    
}
