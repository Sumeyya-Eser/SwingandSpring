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
public class SuccessResult extends Result {
	
	public SuccessResult(boolean success) {
		super(success);
		
	}

	public SuccessResult() {
		super(true);
	}

	public SuccessResult(String message) {
		super(true, message);
		// TODO Auto-generated constructor stub
	}

}
