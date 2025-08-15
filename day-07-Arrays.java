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
        
        List<Integer> numbers = getNumbers();
    
        for (int i = numbers.size()-1; i >= 0; i--) {
        
            System.out.print(numbers.get(i));
            
            if (i == 0) continue;
            
            System.out.print(" ");
        }
        
    }
    
    public static List<Integer> getNumbers() {
        
        List<Integer> numbers = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++){
        
            numbers.add(sc.nextInt());
        
        }
        
        sc.close();
        
        return numbers;
    }
    
    
}
