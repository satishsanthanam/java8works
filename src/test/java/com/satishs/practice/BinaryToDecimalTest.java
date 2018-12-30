package com.satishs.practice;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BinaryToDecimalTest
{
	@Test
	public void convert_to_decimal_from_binary_simple_input_0() throws InvalidInputException
	{
		BinaryToDecimal binToDec = new BinaryToDecimal();
		assertEquals(0, binToDec.convertToDecimal("0"));
		assertEquals(1, binToDec.convertToDecimal("1"));
		assertEquals(2, binToDec.convertToDecimal("10"));
		assertEquals(3, binToDec.convertToDecimal("11"));
		assertEquals(6, binToDec.convertToDecimal("110"));
		assertEquals(7, binToDec.convertToDecimal("111"));
		assertEquals(5, binToDec.convertToDecimal("101"));
		assertEquals(11, binToDec.convertToDecimal("1011"));
		assertEquals(15, binToDec.convertToDecimal("1111"));
	}

	@Test(expected = InvalidInputException.class)
	public void convert_to_decimal_from_binary_invalid_input() throws InvalidInputException
	{
		BinaryToDecimal binToDec = new BinaryToDecimal();
		binToDec.convertToDecimal("125");
	}
}

