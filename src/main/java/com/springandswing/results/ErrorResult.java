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
public class ErrorResult extends Result {
	 public ErrorResult() {
	        super(false);
	    }

	    public ErrorResult(String message) {
	        super(false,message);
	    }
}