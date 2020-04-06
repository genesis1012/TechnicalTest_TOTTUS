package com.test.automation.utils;

import com.ibm.icu.text.DecimalFormat;

public class convertTo {
	
	public static String getDecimal(String valor, int quantity){
	    DecimalFormat df = new DecimalFormat("0.00");
	    return df.format(Double.parseDouble(valor) * quantity).replace(',', '.');
	}

}
