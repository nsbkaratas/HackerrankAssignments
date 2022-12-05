package org.perscholas;

import java.util.Scanner;

public class StringIntro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two strings:");
        String A=sc.next();
        String B=sc.next();
        int sum = A.length()+B.length();
        System.out.println(sum);
        if (A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String upperCase1=A.substring(0,1).toUpperCase()+A.substring(1);
        String upperCase2 = B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(upperCase1.concat(" "+upperCase2));
        sc.close();

	}

}
