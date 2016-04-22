package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		int arabenumber= Integer.parseInt(arabe);
		String result="";
		if (arabenumber>0 && arabenumber<3999){
			if (arabenumber<10){
				result+=convertUniteToRoman(arabenumber);
			}else if (arabenumber<100){
				result+=convertDizaineToRoman(arabenumber);
				result+=convertUniteToRoman(arabenumber%10);
			}else if (arabenumber<1000){
				result+=convertCentaineToRoman(arabenumber);
				result+=convertDizaineToRoman(arabenumber%100);
				result+=convertUniteToRoman(arabenumber%10);
			}else{
				result+=convertMillierToRoman(arabenumber);
				result+=convertCentaineToRoman(arabenumber%1000);
				result+=convertDizaineToRoman(arabenumber%100);
				result+=convertUniteToRoman(arabenumber%10);
			}
		}


		return result;
	}

	public String convertUniteToRoman(int arabe) {
		String romain="";
		switch (arabe){
		case 1: arabe=1;
		romain ="I";
		break;
		case 2: arabe=2;
		romain ="II";
		break;
		case 3: arabe=3;
		romain ="III";
		break;
		case 4: arabe=4;
		romain ="IV";
		break;
		case 5: arabe=5;
		romain ="V";
		break;
		case 6: arabe=6;
		romain ="VI";
		break;
		case 7: arabe=7;
		romain ="VII";
		break;
		case 8: arabe=8;
		romain ="VIII";
		break;
		case 9: arabe=9;
		romain ="IX";
		break;
		}
		return romain;
	}
	public String convertDizaineToRoman(int arabe) {
		String romain="";
		int arabei=arabe/10;
		switch (arabei){
		case 1: arabe=1;
		romain ="X";
		break;
		case 2: arabe=2;
		romain ="XX";
		break;
		case 3: arabe=3;
		romain ="XXX";
		break;
		case 4: arabe=4;
		romain ="XL";
		break;
		case 5: arabe=5;
		romain ="L";
		break;
		case 6: arabe=6;
		romain ="LX";
		break;
		case 7: arabe=7;
		romain ="LXX";
		break;
		case 8: arabe=8;
		romain ="LXXX";
		break;
		case 9: arabe=9;
		romain ="XC";
		break;
		}
		return romain;
	}
	public String convertCentaineToRoman(int arabe) {
		String romain="";
		int arabei=arabe/100;
		switch (arabei){
		case 1: arabe=1;
		romain ="C";
		break;
		case 2: arabe=2;
		romain ="CC";
		break;
		case 3: arabe=3;
		romain ="CCC";
		break;
		case 4: arabe=4;
		romain ="CD";
		break;
		case 5: arabe=5;
		romain ="D";
		break;
		case 6: arabe=6;
		romain ="DC";
		break;
		case 7: arabe=7;
		romain ="DCC";
		break;
		case 8: arabe=8;
		romain ="DCCC";
		break;
		case 9: arabe=9;
		romain ="CM";
		break;
		}
		return romain;
	}
	public String convertMillierToRoman(int arabe) {
		String romain="";
		int arabei=arabe/1000;
		switch (arabei){
		case 1: arabe=1;
		romain ="M";
		break;
		case 2: arabe=2;
		romain ="MM";
		break;
		case 3: arabe=3;
		romain ="MMM";
		break;
		}
		return romain;
	}


	public String convertFromRoman(String roman) {
		String tmp = "";
		int nbr = 0;
		int nbra = 0;
		int nbrp = 0;
		boolean retirer = false;
		for (int i = 0; i < roman.length() ; i++) {
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

			nbrp = nbra;
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
