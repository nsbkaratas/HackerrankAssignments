package org.perscholas;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a string:");
        String S = in.next();
        System.out.println("enter an integer:");
        int num = in.nextInt();
		System.out.println(getSmallestAndLargest(S, num));
		in.close();
	}
	
	 public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
        String largest = "";
        
		smallest = s.substring(0,k);
        largest = s.substring(0,k);
        
        for(int i=0; i<=s.length()-k; i++ ){
            String str = s.substring(i,k+i);
            if (smallest.compareTo(str)>0){
                smallest = str;
            }
            if(largest.compareTo(str)<0){
                largest=str;
            }
        }  
        
        
        return smallest + "\n" + largest;

	}

}
