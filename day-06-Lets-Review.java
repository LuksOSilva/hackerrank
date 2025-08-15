import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numberOfInputs = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < numberOfInputs; i++) {
			
			String input = sc.nextLine();
			
			String output = getSeparatedString(input)
			
			System.out.println(output);
		
		}
		
		
		sc.close();
 
	}
	
	public static String getSeparatedString(String input) {
	
		StringBuilder oddString = new StringBuilder();
		StringBuilder evenString = new StringBuilder();
			
		for (int j = 0; j < input.length(); j++) {
			
			String c = String.valueOf(input.charAt(j));
			
			if (j%2 == 0) {
				evenString.append(c);
				continue;
			} 
			oddString.append(c);
		}
		
		
		return evenString.toString() 
			+ " " 
			+ oddString.toString()
			
		
	}
}