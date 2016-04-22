package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		String tmp = "";
		int nombre = Integer.parseInt(arabe);
		while (nombre > 0) {
			if (nombre/1000 > 0) {
				for (int i = 0; i < nombre/1000; i++) {
					tmp = 'M' + tmp;
				}
				nombre -= (nombre/1000) * 1000;
			}
			if (nombre / 500 > 0) {
				for (int i = 0; i < nombre/500; i++) {
					tmp = 'D' + tmp;
				}
				nombre -= (nombre/500) * 500;
			}
			if (nombre / 100 > 0) {
				for (int i = 0; i < nombre/100; i++) {
					tmp = 'C' + tmp;
				}
				nombre -= (nombre/100) * 100;
			}
			if (nombre / 50 > 0) {
				for (int i = 0; i < nombre/50; i++) {
					tmp = 'L' + tmp;
				}
				nombre -= (nombre/50) * 50;
			}
			if (nombre / 10 > 0) {
				for (int i = 0; i < nombre/10; i++) {
					tmp = 'X' + tmp;
				}
				nombre -= (nombre/10) * 10;
			}
			if (nombre / 5 > 0) {
				for (int i = 0; i < nombre/5; i++) {
					tmp = 'V' + tmp;
				}
				nombre -= (nombre/5) * 5;
			}
			for (int i = 0; i < nombre; i++) {
				tmp = 'I' + tmp;
				nombre--;
			}
		}
		return tmp;
	}

	public String convertFromRoman(String roman) {
		String tmp = "";
		int nbr = 0;
		int nbra = 0;
		int nbrp = 0;
		boolean retirer = false;
		for (int i = roman.length()-1; i >= 0 ; i--) {
			char charat = roman.charAt(i);	

			
			if (charat == 'M') {
				nbra = 1000;
			}
			if (charat == 'D') {
				nbra = 500;
			}
			if (charat == 'C') {
				nbra = 100;
			}
			if (charat == 'L') {
				nbra = 50;
			}
			if (charat == 'X') {
				nbra = 10;
			}
			if (charat == 'V') {
				nbra = 5;
			}
			if (charat == 'I') {
				nbra = 1;
			}
			
			if (nbrp > 0)
				if (nbra > nbrp)
					retirer = true;
			
			if (retirer)
				nbr = (nbr - nbrp) + (nbra-nbrp);
			else nbr += nbra;
			
			retirer = false;
		}
		tmp = nbr+"";
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
