public class blah {

    public int diff21(int n) {
	if (n <= 21) {
	    return (21 - n);
	}
	else {
	    return (2 * (n - 21));
	}
    }

    public boolean nearHundred(int n) {
	if ((n>=90) && (n<=110)) return true;
	if ((n>=190) && (n<=210)) return true;
	else return false;
    }

    public boolean mixStart(String str) {
	if (str.length() < 3) return false;
	if (str.substring(1, 3).equals("ix")) 
	    {return true;
	    }
	else
	    {return false;
	    }
    }

    public int teaParty(int tea, int candy) {
 
	if ((tea < 5) || (candy < 5)) return 0;
	if (((tea / 2) >= candy) || ((candy / 2) >= tea)) return 2;
	else return 1;
    }
    
    public boolean lastDigit(int a, int b, int c) {
	a = a % 10;
	b = b % 10;
	c = c % 10;
	if ( (a == b) || (a == c) || (b == c) ) return true;
	else return false;
    }


}
