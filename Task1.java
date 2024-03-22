package Task;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java Array Program to Remove Duplicates elements from an Array

		//Example : -
		//Input : [1, 2, 2, 3, 3, 4, 5 ]
		//Output :[ 1, 2, 3, 4, 5 ]
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of element in array");
		int n=sc.nextInt();
		System.out.println("enter the element of array");
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		Arrays.sort(arr);
		System.out.println("Output: ");
		System.out.println(arr[0]);
		
		for(int i=1;i<n;i++){
			if(arr[i-1]!=arr[i])
				System.out.println(arr[i]);
		}
		
		
		
		

	}

}
