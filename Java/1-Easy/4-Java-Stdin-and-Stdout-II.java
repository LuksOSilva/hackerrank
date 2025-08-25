import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Integer in = scan.nextInt();
        double db = scan.nextDouble();
        scan.nextLine();
        String line = scan.nextLine();
        
        
        int formatedDouble = (int) db;
    
        System.out.println("String: " + line);
        System.out.println("Double: " + db);
        System.out.println("Int: " + in);
    }
}
