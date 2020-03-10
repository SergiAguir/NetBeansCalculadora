/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumne
 */
public class Calculadora {
	    
    	/** The num 1. */
    	private int num1;
	    
    	/** The num 2. */
    	private int num2;
	    
	    /**
    	 * Instantiates a new calculadora.
    	 *
    	 * @param a the a
    	 * @param b the b
    	 */
    	public Calculadora(int a, int b){
	        num1 = a;
	        num2 = b;
	    }
	    
    	/**
    	 * Suma.
    	 *
    	 * @return the int
    	 */
    	public int suma(){
	        int resul = num1 + num2;
	        return resul;
	    }
	    
    	/**
    	 * Resta.
    	 *
    	 * @return the int
    	 */
    	public int resta(){
	    	int resul;
	    	if (resta2()) {
	    		resul = num1 - num2;
	    	} else {
	    		resul=num2-num1;
	    	}
	        return resul;
	    }
	    
    	/**
    	 * Multiplica.
    	 *
    	 * @return the int
    	 */
    	public int multiplica(){
	        int resul = num1 * num2;
	        return resul;
	    }
	    
    	/**
    	 * Divide.
    	 *
    	 * @return the int
    	 */
    	public int divide(){
	        int resul = num1 / num2;
	        return resul;
	    }
	    
	    /**
    	 * Resta 2.
    	 *
    	 * @return true, if successful
    	 */
    	public boolean resta2() {
	    	if (num1>=num2) return true;
	    	else return false;
	    }
	    
	    /**
    	 * Dividie 2.
    	 *
    	 * @return the integer
    	 */
    	public Integer dividie2() {
	    	if (num2==0) return null;
	    	
	    	int resul=num1/num2;
	    	return resul;
	    }
	
}