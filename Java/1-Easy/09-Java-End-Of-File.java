import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int counter = 0;
        while (sc.hasNext()) {
            counter++;
            System.out.println(counter + " " + sc.nextLine());
        }
        
        sc.close();
    }
}