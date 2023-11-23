package com.stringBuffer;

public class StringBufferAppend {
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer("Hello");
		sb.append("world");
		System.out.println(sb);
		StringBuffer sb1=new StringBuffer("hello");
		sb1.insert(5,"welcome");
		System.out.println("Insert :"+ sb1);
		
	}

}
