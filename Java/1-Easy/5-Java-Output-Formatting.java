import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<String> inputs = new ArrayList<>();
        while(sc.hasNext()) {
            inputs.add(sc.nextLine());
        }
        
        System.out.println("================================");
        for (String input : inputs) {
            String[] separatedInput = input.split(" ");
            Integer numberInput = Integer.parseInt(separatedInput[1]);
            
            System.out.printf("%-14s %0,3d %n", separatedInput[0], numberInput);
        }
        System.out.println("================================");
        
        sc.close();
    }
}