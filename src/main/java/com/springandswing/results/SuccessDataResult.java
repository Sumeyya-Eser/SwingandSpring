/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springandswing.results;

/**
 *
 * @author seser
 */
public class SuccessDataResult<T> extends DataResult<T> {
	public SuccessDataResult(T data, String message) {
        super(data,true, message);
    }
    public SuccessDataResult(T data)
    {
        super(data,true);
    }


    public SuccessDataResult(String messge)
    {
        super(null,true,messge);
    }

    public SuccessDataResult()
    {
        super(null,true);
    }
	

}
