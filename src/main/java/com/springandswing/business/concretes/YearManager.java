/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springandswing.business.concretes;

import com.springandswing.business.abstracts.YearService;
import com.springandswing.dataAccess.YearDao;
import com.springandswing.entities.Year;
import com.springandswing.results.DataResult;
import com.springandswing.results.SuccessDataResult;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 *
 * @author seser
 */
@Service
public class YearManager implements YearService{
    private YearDao yearDao;
    
    public YearManager(YearDao yearDao){
        this.yearDao=yearDao;
    }

    @Override
    public DataResult<List<Year>> getAll() {
        return new SuccessDataResult<> (this.yearDao.findAll());
    }

    @Override
    public DataResult<List<Year>> getAllSorted() {
        Sort sort = Sort.by(Sort.Direction.DESC,"carPrice");
        return new SuccessDataResult<> (this.yearDao.findAll(sort));
    }
    
}
