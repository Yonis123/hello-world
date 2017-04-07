package nur;

import java.util.Scanner;
/** 
 * Check the largest number
 * April 7 2017
 * @author 324038611 (Yonis Nur)
 *
 */
/** 
 * scans
 * prints out the question and answer
 * puts amount of numbers you put into array
 * does for loop checking next number until x is equal to number
 */
public class largestNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many nums will you give");
		int num = sc.nextInt();
		System.out.println("Enter your numbers seperated by a space");
		int[] nums = new int[num];
		for(int x = 0; x < num; x++){
			nums[x] = sc.nextInt();
		}
		
		System.out.println(greatestNum(nums));
		
	}
	
	/**
	 * declares variable
	 * makes variable max equal to the highest number
	 * @param num
	 * @return
	 */
	public static int greatestNum(int[]num){
	int max = num[0];
	for(int i= 0; i<num.length; i++){
		
		max = Math.max(max, num[i]);
		
	}

	
	return max;	
    
	}
   
	}
