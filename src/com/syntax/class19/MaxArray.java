package com.syntax.class19;

public class MaxArray {
	  
	  public static int maxValue(int []arr){
	    int max=arr[0];
	    for(int i=0;i<arr.length;i++){
	      if( arr[i]>max){
	        max=arr[i];
	      }
	    }
	  return max;  
	  }
		public static void main(String[] args) {
			int[] arr = {5,12,-3,7,3,22};
			System.out.println(maxValue(arr)); //should print 22
		}
	  }

