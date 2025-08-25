import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Integer> numbers = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            numbers.add(sc.nextInt());
        }
        
        for (Integer number : numbers) {
            System.out.println(number);
        }
        
        sc.close();
    }
}
