package com.bridgelabz;

public class ReverseString {  
	public static void main(String[] args) {
		String test = "Hello My Name Is Shivani";
		System.out.println("String: " +test);
		System.out.println("Reverse using reverseStringBuffer:" + reverseStringBuffer(test));
		System.out.println("Reverse using reverseCharArray:" + reverseCharArray(test));
		System.out.println("Reverse using reverseRecursion:" + reverseRecursion(test));
	}

	private static String reverseStringBuffer(String str) {
		// TODO Auto-generated method stub
		return new StringBuffer(str).reverse().toString();
	}

	public static String reverseCharArray(String st) {
	    char[] reverseStringArray = new char[st.length()];
	    for (int i = st.length() - 1, j = 0; i != -1; i--, j++) {
	    	//Returns char value at particular index ranging from 0 to length()-1.
			//first char value of the sequence is at index 0,next at index 1,as for array indexing.
	        reverseStringArray[j] = st.charAt(i);
	    }
	    return new String(reverseStringArray);
	}

	public static String reverseRecursion(String st) {
	    if (st.length() <= 1) {
	        return st;
	    }
	    //Returns a string that is a substring of this string.
	    //substr begin at the firstIndex and extends to the char at index lastIndex - 1.
		return reverseRecursion(st.substring(1, st.length())) + st.charAt(0);
	}
}