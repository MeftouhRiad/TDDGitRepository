package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		String tmp = "";
		int nombre = Integer.parseInt(arabe);
		while (nombre > 0) {
			if (nombre/1000 > 0) {
				for (int i = 0; i < nombre/1000; i++) {
					tmp += 'M';
				}
			}
			if (nombre / 500 > 0) {
				for (int i = 0; i < nombre/500; i++) {
					tmp += 'D';
				}
			}
			if (nombre / 100 > 0) {
				for (int i = 0; i < nombre/100; i++) {
					tmp += 'C';
				}
			}
			if (nombre / 50 > 0) {
				for (int i = 0; i < nombre/50; i++) {
					tmp += 'L';
				}
			}
			if (nombre / 10 > 0) {
				for (int i = 0; i < nombre/10; i++) {
					tmp += 'X';
				}
			}
			if (nombre / 5 > 0) {
				for (int i = 0; i < nombre/5; i++) {
					tmp += 'V';
				}
			}
			if (nombre / 1 > 0) {
				for (int i = 0; i < nombre/1; i++) {
					tmp += 'I';
				}
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

	/*
	 
1 = I

5 = V

10 = X

50 = L

100 = C

500 = D

1000 = M

	 */
}
