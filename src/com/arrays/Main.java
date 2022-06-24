package com.arrays;
import java.util.*;
public class Main {
	public static void main(String[] args) {

 	ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,5,3,8,5));
		Integer sum = 0;
		for (Integer num : numbers) {
			sum += num;
		}
		
		System.out.println(sum);
	 

		toPower(2,3);
		
		
		
	}
	
//	What is the output?
//	          double[ ] exampleArray = {1,5,6,5,4,1};
//
//	          double maximum = examplesArray[0];
//
//	          int index = 0;
//
//	          for (int i = 1; i<exampleArray.length>; i++){
//
//	               if (exampleArray[ i ] > maximum) {
//
//	                    maximum = exampleArray[ i ];
//
//	                    index = i;
//
//	               }
//
//	          }
//
//	          System.out.println(index);
//			It will print out 2 since the index of the maximum number(6) is 2;
	
//
	public static void toPower(int size, int power) {
		
		ArrayList powers = new ArrayList<>();
		
		for (double i = 0; i < size; i++) {
			double product = Math.pow(i, power);
			powers.add(product);
		}
		
		System.out.println(powers.toString());
	}
	
	
	

}
