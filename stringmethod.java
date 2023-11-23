package com.stringdemo;

public class stringmethod {
	public static void main(String[] args) {
		
		        String s1 = "HEllo world welcome";
		        int n = s1.length();
		        System.out.println(n);
		        System.out.println("First index: " + s1.charAt(0));
		        System.out.println("Last Index: " + s1.charAt(n-1));
		        System.out.println("sub string: " + s1.substring(11));
		        System.out.println("sub string with end: " + s1.substring(9,15));
		        System.out.println("Matching: " + s1.contains("world"));
		        System.out.println("Matching: " + s1.contains("hi"));
		        System.out.println("Format: " + String.format("My company's name is %s !", s1));
		        
		    }}
