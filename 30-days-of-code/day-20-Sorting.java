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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> inputs = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        
        int totalSwaps = 0;
        
        
        for (int i = 0; i < n; i++) {
            int numberOfSwaps = 0;
            
            for (int j = 0; j < n - 1; j++) {
                if (inputs.get(j) > inputs.get(j +1)) {
                    swap(inputs, inputs.get(j), inputs.get(j+1));
                    numberOfSwaps++;
                }
            }
            
            if (numberOfSwaps == 0) break;
            totalSwaps += numberOfSwaps;
        }
        
        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + inputs.get(0));
        System.out.println("Last Element: " + inputs.get(inputs.size()-1));
        
        bufferedReader.close();
    }
    
    public static void swap(List<Integer> inputs, int higher, int lower) {
    
        int indexOfHigher = inputs.indexOf(higher);
        int indexOfLower = inputs.indexOf(lower);
        
        inputs.set(indexOfHigher, lower);
        inputs.set(indexOfLower, higher);
    
    }
}
