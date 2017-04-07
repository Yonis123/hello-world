package nur;

import java.util.Scanner;

public class IsPrime {
/**
 * is prime
 * This program check if it's a prime
 * April 7 2017
 * author: Yonis Nur
 */
	/**
	 * scans number
	 * prints out that your number is a prime number
	 * @param args
	 */
	public static void main(String[] args) {
	System.out.print("Enter a number");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	if(prime(num)==true){
		System.out.println("The number you enter is a prime number");
	}
	else if(prime(num)== false){
		
		System.out.println("Your number is not a prime number");
	}
	}
	/**
	 * checks if the remainder of x and y is 0
	 * checks if any number (after you divide number by 2) is divisible and gives a remainder of 0
	 * @param x
	 * @param y
	 * @return
	 */
	public static boolean isDivisible(int x, int y){
		
		if(x%y==0){
			return true;
		}
      return false;	
	}
	public static boolean prime(int number){
		for(int i=2;i<number/2;i++)
		if(number%i==0){
		return false;	
		}
		return true;
	}
        
	
}
	

