public class Codingbat {

    /*Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count. */
    public boolean mixStart(String str) {
	if (str.length() <= 2) return false;
	return str.substring(1,3).equals("ix");
    }
///////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////
    /* "Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j. "*/
    public String makeOutWord(String out, String word) {
	String startOut = out.substring(0,2);
	String endOut = out.substring(2);
	return startOut+word+endOut;
    }
///////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////
    /*Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".*/
    public String firstHalf(String str) {
	return str.substring(0, str.length() / 2);
    }
    //System.out.println(3/2); //This returns 1

}
