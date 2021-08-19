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
public class DataResult<T> extends Result {
	private T data;
	public DataResult(T data,boolean success,String message) {
		super(success,message);
		this.data=data;
	}
	public DataResult(T data,boolean success) {
		super(success);
		this.data=data;
	}
	
	public T getData() {
		return this.data;
	}

}
