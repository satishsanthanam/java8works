package com.satishs.practice;

public class BinaryToDecimal {
	
	public long convertToDecimal(String binaryVar) throws InvalidInputException
	{
		long posVal = 1;
		int binarySize = binaryVar.length();
		long result = 0;
		for (int i = 0; i < binarySize; ++i)
		{
			int binValAtCurPos =  (binaryVar.charAt(binarySize - i - 1) - '0');
			if (binValAtCurPos > 1)
				throw new InvalidInputException("Input string " + binaryVar + " contains other than 0 & 1");
			result += posVal * (binaryVar.charAt(binarySize - i - 1) - '0');
			posVal *= 2;
		}
		return result;
	}
}
