package nur;
import java.util.Scanner;
public class Factorial {
	/**
	 * is prime
	 * This program check if it's a factorial
	 * April 7 2017
	 * author: Yonis Nur
	 */
	private static Scanner sc;
   /**
    * check if factorial
    * @param a
    * @return
    */
	static int factorial(int a){
		if(a==0){
		return 1;
			
		}
		else{
		return(a*factorial(a-1));	
		
		}	
	
	}
	/**
	 * scans number & prints the factorial
	 * @param args
	 */
	public static void main (String[]args){
		
		
		sc = new Scanner(System.in);
		int fact=1;
		
		
		int num = sc.nextInt();
		fact = factorial(num);
		System.out.println("The factorial is " + fact);
		
		
		
		
		
		
		
	}
	
	
}
