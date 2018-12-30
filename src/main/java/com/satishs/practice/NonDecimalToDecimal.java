package com.satishs.practice;

public class NonDecimalToDecimal {
	int posValMultiplier = 2;

	public enum NON_DEC_TYPE {BINARY, OCTAL, DECIMAL, HEXDECIMAL};

	public NonDecimalToDecimal(NON_DEC_TYPE nonDecType)
	{
		switch (nonDecType)
		{
			case BINARY:
				posValMultiplier = 2;
				break;
			case OCTAL:
				posValMultiplier = 8;
				break;
			case DECIMAL:
				posValMultiplier = 10;
				break;
			case HEXDECIMAL:
				posValMultiplier = 16;
				break;
			default:
				break;
		}
	}

	public void setPosValMultiplier(int val)
	{
		posValMultiplier = val;
	}

	public int getPosValMultiplier()
	{
		return posValMultiplier;
	}
	
	public long convertToDecimal(String nonDecimalVar) throws InvalidInputException
	{
		long posVal = 1;
		int binarySize = nonDecimalVar.length();
		long result = 0;
		for (int i = 0; i < binarySize; ++i)
		{
			int binValAtCurPos =  (nonDecimalVar.charAt(binarySize - i - 1) - '0');
			if (binValAtCurPos > posValMultiplier - 1)
				throw new InvalidInputException("Input string " + nonDecimalVar + " nonvalid");
			result += posVal * (nonDecimalVar.charAt(binarySize - i - 1) - '0');
			posVal *= posValMultiplier;
		}
		return result;
	}
}
