package com.bridgelabz.Junit;


import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class ConversionTest
{    
	@Test
    public void testTempConversion() throws Throwable {
		Conversion underTest =new Conversion();
		double temprature=80.0d;
		String unit=" ";
		double result=underTest.tempConversion(temprature, unit);
		assertEquals(176.0d,result,0.0);
	}
    	
    }

    