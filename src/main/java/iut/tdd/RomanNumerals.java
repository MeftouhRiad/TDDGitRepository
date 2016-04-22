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
		boolean retirer = false;
		for (int i = roman.length()-1; i >= 0 ; i--) {
			char charat = roman.charAt(i);
			if (charat == 'M') {
				nbr += 1000;
				retirer = true;
			}
			if (charat == 'D') {
				nbr += 500;
				retirer = true;
			}
			if (charat == 'C') {
				nbr += 100;
				retirer = true;
			}
			if (charat == 'L') {
				nbr += 50;
				retirer = true;
			}
			if (charat == 'X') {
				nbr += 10;
				retirer = true;
			}
			if (charat == 'V') {
				nbr += 5;
				retirer = true;
			}
			if (charat == 'I') {
				if (retirer)
					nbr -= 1;
				else
					nbr += 1;
			}
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
