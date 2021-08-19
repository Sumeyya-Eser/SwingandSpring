/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springandswing.dataAccess;

import com.springandswing.entities.Year;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author seser
 */
public interface YearDao extends JpaRepository<Year,Integer> {
    Year findById(int yearId);
    Year getByYear(int year);
    
}
