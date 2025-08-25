import java.io.*;
import java.util.*;

public class Solution {
    
    static class SeriesNumbers {
        int a;
        int b;
        int n;
        List<Integer> answers = new ArrayList<>();
        
        public SeriesNumbers(String s) {
            String[] splited = s.split(" ");
            
            this.a = Integer.parseInt(splited[0]);
            this.b = Integer.parseInt(splited[1]);
            this.n = Integer.parseInt(splited[2]);
            
        }
        
        public void doTheMath() {
            int sum = a;
            
            for (int i = 0; i < n; i++) {
                
                sum += (int)(Math.pow(2, i) * b);
                
                answers.add(sum);
            }
            
        }
        
     }    
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int q = sc.nextInt();
        sc.nextLine();
        
        List<SeriesNumbers> series = new ArrayList<>();
        
        for (int i = 0; i < q; i++) {
            SeriesNumbers s = new SeriesNumbers(sc.nextLine());
            s.doTheMath();
            series.add(s);
        }
        
        
        for (SeriesNumbers s : series) {
            for (int answer : s.answers) {
                System.out.print(answer + " ");
            }
            System.out.println();
        }
        
        
        
        sc.close();
    }
}