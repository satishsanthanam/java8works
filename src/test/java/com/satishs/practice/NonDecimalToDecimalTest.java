package com.satishs.practice;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NonDecimalToDecimalTest
{
	@Test
	public void convert_to_decimal_from_binary() throws InvalidInputException
	{
		NonDecimalToDecimal binToDec = new NonDecimalToDecimal(NonDecimalToDecimal.NON_DEC_TYPE.BINARY);
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
		NonDecimalToDecimal binToDec = new NonDecimalToDecimal(NonDecimalToDecimal.NON_DEC_TYPE.BINARY);
		binToDec.convertToDecimal("125");
	}

	@Test
	public void convert_to_decimal_from_octal_input() throws InvalidInputException
	{
		NonDecimalToDecimal binToDec = new NonDecimalToDecimal(NonDecimalToDecimal.NON_DEC_TYPE.OCTAL);
		assertEquals(0, binToDec.convertToDecimal("0"));
		assertEquals(1, binToDec.convertToDecimal("1"));
		assertEquals(8, binToDec.convertToDecimal("10"));
		assertEquals(9, binToDec.convertToDecimal("11"));
		assertEquals(72, binToDec.convertToDecimal("110"));
		assertEquals(73, binToDec.convertToDecimal("111"));
		assertEquals(69, binToDec.convertToDecimal("105"));
		assertEquals(750, binToDec.convertToDecimal("1356"));
		assertEquals(2293, binToDec.convertToDecimal("4365"));
	}

	@Test(expected = InvalidInputException.class)
	public void convert_to_decimal_from_octal_invalid_input() throws InvalidInputException
	{
		NonDecimalToDecimal binToDec = new NonDecimalToDecimal(NonDecimalToDecimal.NON_DEC_TYPE.OCTAL);
		binToDec.convertToDecimal("128");
	}
}

