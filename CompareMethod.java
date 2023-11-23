package com.Stringcompare;

public class CompareMethod {
	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3 ="mee";
		String s4 ="hii";
		String s5="flag";
			System.out.println(s1.compareTo(s2));//equal=0
			System.out.println(s1.compareTo(s3));//less than s3 so -
			System.out.println(s1.compareTo(s4));//
			System.out.println(s1.compareTo(s5));//greater than s5 so +
	}

}
