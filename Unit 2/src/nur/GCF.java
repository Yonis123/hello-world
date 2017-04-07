package nur;
import java.util.Scanner;
public class GCF {
/**
 * Checks greatest common factor
 * April 7 2107
 * author: Yonis Nur
 * @param args
 */
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your first number");
	int secondnum=sc.nextInt();
	System.out.println("Enter second number");
	int firstnum=sc.nextInt();
	System.out.println("The greatest common factor is " + gcf(firstnum, secondnum));
/**
 * checks which number is greater
 * checks if they're divisible by each other
 * 
 */
	}
public static int gcf(int firstnum, int secondnum){
	if(firstnum>secondnum){
		for(int i = firstnum;i>0;i--){
			if(isDivisble(firstnum, i)==true&& isDivisble(secondnum, i)==true){
				return i;
				
			}
			
		}
		
	}
	if(secondnum>firstnum){
		for(int i=secondnum;i>0;i--){
			if(isDivisble(secondnum,i) ==true&&isDivisble(firstnum,i)==true){
				
			}
			return i;
		}
		
	}
	return firstnum;
	
}
/**
 * check if remainder is 0
 * @param x
 * @param y
 * @return
 */
private static boolean isDivisble(int x, int y) {
	if(x%y==0){
		return true;
	}
	return false;
}



}
