package com.stringbuilder;

public class StringBuilderEx {
public static void main(String[] args) {
	StringBuilder sb= new StringBuilder("Hello");
	sb.append(" people ");
	System.out.println(sb);
	StringBuilder sb1= new StringBuilder("I ampainting");
	sb1.delete(0,4);
	System.out.println(sb1);
	sb1.deleteCharAt(3);
	System.out.println(sb1);
	
}
}
