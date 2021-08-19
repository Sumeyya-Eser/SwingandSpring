/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springandswing.business.concretes;

import com.springandswing.business.abstracts.CarService;
import com.springandswing.dataAccess.CarDao;
import com.springandswing.entities.CarPrice;
import com.springandswing.entities.Year;
import com.springandswing.results.DataResult;
import com.springandswing.results.SuccessDataResult;
import java.awt.Color;
import java.awt.Paint;
import java.util.List;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.TextAnchor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 *
 * @author seser
 */
@Service
public class CarManager implements CarService {

    private CarDao carDao;
    
    @Autowired
    public CarManager(CarDao carDao){
        this.carDao=carDao;
    }
    

    @Override
    public DataResult<List<CarPrice>> getAll() {
        return new SuccessDataResult<> (this.carDao.findAll());
    }

    @Override
    public DataResult<List<CarPrice>> getAllSorted() {
        Sort sort = Sort.by(Sort.Direction.DESC, "carPrice");
        return new SuccessDataResult<> (this.carDao.findAll(sort));
    }

    

 
}
    
    

