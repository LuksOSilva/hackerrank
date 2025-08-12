//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, String> phoneBook = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
        
            phoneBook.putAll(getRegisterForPhoneBook(sc));
        
        }
        
        while (sc.hasNext()){
            String searchedName = sc.nextLine();
           
            if (!phoneBook.containsKey(searchedName)) {
                System.out.println("Not found");
				continue;
            }
			
			System.out.println(searchedName + "=" + phoneBook.get(searchedName));      
        }
        
        sc.close();
    }
    
    public static Map<String, String> getRegisterForPhoneBook(Scanner sc) {
        
        String input = sc.nextLine();
        String[] registerData = input.split(" ");
        
        String name = registerData[0];
        String number = registerData[1];
        
        
        return Map.of(name, number);
    }
}