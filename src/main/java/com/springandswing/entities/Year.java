/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springandswing.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author seser
 */
@Table(name="years")
@Entity
public class Year {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="year_id")
    private int yearId;
    
    
    @Column(name="year")
    private int year;
    
    public Year(int yearId,int year){
        super();
        this.yearId=yearId;
        this.year=year;
        
    }

    /**
     * @return the yearId
     */
    public int getYearId() {
        return yearId;
    }

    /**
     * @param yearId the yearId to set
     */
    public void setYearId(int yearId) {
        this.yearId = yearId;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    
    
    
    
}
