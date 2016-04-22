package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		String tmp = "";
		if (Integer.parseInt(arabe) < 5) {
			for (int i = 0; i < Integer.parseInt(arabe); i++) {
				tmp += "I";
			}
			
		}
		return tmp;
	}

	public String convertFromRoman(String roman) {
		String tmp = "";
		for (int i = 0; i < roman.length(); i++) {
			if (roman.charAt(i) == 'I')
				tmp += '1';
		}
		return tmp;
	}

}
