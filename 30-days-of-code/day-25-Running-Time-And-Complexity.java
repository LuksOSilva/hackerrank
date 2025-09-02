import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numberOfInputs = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < numberOfInputs; i++ ) {
            int input = sc.nextInt();
            
            if (isPrime(input)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
            
        }
        
        sc.close();
    }
    
    static boolean isPrime(int input) {
        if (input == 1) return false;
        if (input % 2 == 0 && input != 2) return false;
        
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}
