package nur;
import java.util.Scanner;
public class SumDigits {
/** 
 * Gets sum of digits
 * April 7 2017
 * Yonis nur
 * @param args
 */
	/** 
	 * prints the squestion and answer
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your numbers");
		int num = sc.nextInt();
		System.out.println("The sum of digits is "+sumdigits(num));
		sc.close();

	}
/**
 * adds the sum
 * @param num
 * @return
 */
	static int sumdigits(int num)
	{
		int sum =0;
		while(num>0){
		sum = sum + num%10;
		num = num/10;
		}
			return sum;	
			
		}
		
	}

