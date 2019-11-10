package com.interview.creditcardvalidator.utils;

/*
An utility class which does some basic functions
 */
public class CardValidatorUtils {
	
	public static String getStrFromNumber(long number)
	{
		return number+"";
	}

	public static String stripData(String number) {
		if (number != null)
			return number.replaceAll("\\s+","");
		return "";
	}

	public static int getCumulativeValue(int num) {
		while (num/10 > 0)
			num = num/10 + num%10;
		return num;
	}

}
