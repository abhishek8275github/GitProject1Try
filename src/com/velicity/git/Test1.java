package com.velicity.git;


import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		
		int [] arr= {1,3,5,4,7,8,9};
		
		List <Integer> list = new ArrayList<>();
		
		for (int i:arr) {
			list.add(i);
			}
		

		System.out.println("Array List : " + list);

	}

	

}
