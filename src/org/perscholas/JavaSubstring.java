package org.perscholas;

import java.util.Scanner;

public class JavaSubstring {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a string and two idex number for that string:");
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
        in.close();

	}

}
