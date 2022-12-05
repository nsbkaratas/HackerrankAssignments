package org.perscholas;

import java.util.Scanner;

public class JavaTokens {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("enter a sentence:");
	     String s = scan.nextLine();
	        
         String[] tokens = s.split("[^a-zA-Z]");
         int numTokens = 0;
        
         for (int i=0; i<tokens.length; ++i) {
             if (tokens[i].length() > 0) 
                 numTokens++;
         }  
         System.out.println(numTokens);
        
         for (int i=0; i<tokens.length;++i) {
             if (tokens[i].length() > 0)
                 System.out.println(tokens[i]);
         }  
	        scan.close();

	}

}
