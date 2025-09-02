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
    
    static class Client {
    
		
	
        String firstName;
        String email;
        
        Client(String firstName, String email) throws IOException {
			if (!isEmailValid(email)) {
				throw new IOException("Invalid Email");
			}
			
            this.firstName = firstName;
            this.email = email;
        }
		
		boolean isEmailValid(String email) {
			Pattern p = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
			Matcher m = p.matcher(email);
			
			return m.find();
		}
        
        boolean isProviderGmail() {
			return email.endsWith("@gmail.com");
		}
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
		
        
        List<Client> clientList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] clientData = sc.nextLine().split(" ");
            
            String firstName = clientData[0];
            String email = clientData[1];
			
			try {
				
				clientList.add(new Client(firstName, email));
				
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
			
        }
        sc.close();
        
        clientList.sort((a, b) -> {
            
            String firstNameA = a.firstName;
            String firstNameB = b.firstName;
            
            
            return firstNameA.compareTo(firstNameB);
        });
        
        
        for (Client client : clientList) {
            if (client.isProviderGmail()) {
                System.out.println(client.firstName);
            }
        }
        

    }
}
