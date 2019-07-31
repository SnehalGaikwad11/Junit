package com.bridgelabz.Junit;


public class Conversion 
{
    public double tempConversion (double temprature,String unit) 
    {
    	if(unit.equals("F"))
    		return (temprature-32)*(5.0/9.0);
    	else
    		return (temprature *(9.0/5.0))+32;
    }
}
