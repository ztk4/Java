
public class RomanNumerals {

	public int toArabic (String roman) {
		int num = 0, lastChar = 0;
		for(int i=roman.length()-1; i>=0; i--) {
			int val = getVal(roman.charAt(i));
			if(val < lastChar) num -= val;
			else num += val;
			lastChar = val;
		}
		return num;
	}
	
	public static int getVal(char c) {
		switch(c) {
		case 'I': return 1;
		case 'V': return 5;
		case 'X': return 10;
		case 'L': return 50;
		case 'C': return 100;
		case 'D': return 500;
		case 'M': return 1000;
		default: return 0;
		}
	}
	
}
