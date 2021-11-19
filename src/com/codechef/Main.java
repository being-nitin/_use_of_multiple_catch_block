package com.codechef;

public class Main {

    public static void main(String[] args) {
	/*
	   Exception handling with multiple catch block.
	 */
    try{
        int[] arr = new int[5];
        arr[5]=32/0;
    }
    catch(ArithmeticException e){
        System.out.println("0 is not an integer");
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("index out of bound");
    }
    }
}
