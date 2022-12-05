package org.perscholas;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
        String A=sc.next();
        
        String reversed = new StringBuilder(A).reverse().toString();
        if(A.equals(reversed)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        sc.close();

	}

}
