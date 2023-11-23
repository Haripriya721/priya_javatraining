package com.arraydemo;

public class Main {
	public static void main(String[]args) {
		Employee[] arr;
			arr=new Employee[3];
		arr[0]=new Employee(101,"abc","Banglore");
		arr[1]=new Employee(102,"pqr","chennai");
		arr[2]=new Employee(1013,"xyz","pune");
		for(Employee i:arr) {
			System.out.println(i.em_id+""+i.em_name+""+i.em_loc);
		}
			
	}

}
