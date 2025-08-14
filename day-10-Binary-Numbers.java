import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine().trim());
        
        String binaryNumber = Integer.toBinaryString(n);

        System.out.println(getHighestConsecutiveOnes(binaryNumber));
        
        
        sc.close();
    }
    
    
    public static int getHighestConsecutiveOnes(String binaryNumber) {
        
		int highestConsecutiveOnes = 0;
		
        String[] splitNumbers = binaryNumber.split("0");
        
        for (String splitNumber : splitNumbers) {
            
            int consecutiveOnes = splitNumber.length();
            
            if (consecutiveOnes > highestConsecutiveOnes) {
                highestConsecutiveOnes = consecutiveOnes;
            }
            
        }
        
        return highestConsecutiveOnes;
    }
}
