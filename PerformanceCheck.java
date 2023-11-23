package com.difference.StringBufferndBuilder;

public class PerformanceCheck {
	public static void main(String[] args) {
		long start_time=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer("Ureka");
		for(int i=0;i<100000;i++) {
			sb.append(" wonderful ");
			
		}
		System.out.println("Time taken by stringBuffer="+(System.currentTimeMillis()-start_time)+"ms");
		
		start_time=System.currentTimeMillis();
		StringBuilder sb1=new StringBuilder("Hello");
		for(int i=0;i<100000;i++) {
			sb1.append(" world ");}
		System.out.println("Time taken by stringBuilder="+(System.currentTimeMillis()-start_time)+"ms");
		
	}

}
