package org.perscholas.exeptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	public static void main (String[] args) {
		 Scanner scn = new Scanner(System.in);
		   try{
	            int x=scn.nextInt();
	            int y=scn.nextInt();
	            System.out.println(x/y);
	        }catch(ArithmeticException|InputMismatchException e){
	            if(e instanceof ArithmeticException){
	                System.out.println("java.lang.ArithmeticException: / by zero");
	            }else if(e instanceof InputMismatchException){
	                System.out.println("java.util.InputMismatchException");
	            }
	        }
	        scn.close();
	}
}
