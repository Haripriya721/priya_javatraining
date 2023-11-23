package com.arraydemo;

public class arraytomethod {
	static void add(int arr[]) {
		int add=0;
		for(int i=0;i<arr.length;i++)
			add=add+arr[i];
					System.out.println("sum_of_array = "+add);
	}
public static void main(String[]args) {
	int a[]= {3,78,45,3};
	add(a);
	
}
}
