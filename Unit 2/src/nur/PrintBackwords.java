package nur;
/**
 * PrintBackwards
 * This program prints the sentence inputed backwards
 * April 21
 *Author: Yonis Nur
 *not enough time to finish capital letters 
 */
import java.util.Scanner;

public class PrintBackwords {
	public static void main(String[] args) {
		System.out.println("Please enter sentence");
		Scanner sc = new Scanner(System.in);
		String[] sentence = sc.nextLine().split(" ");
		
		for (int i = 0; i < sentence.length; i++) {
			for (int n = sentence[i].length() - 1; n >= 0; n--) {
				System.out.print(sentence[i].charAt(n));
			}
			
            	   sentence[1].toUpperCase();
               }
			
				System.out.print(" ");
		
			}
       
	}
