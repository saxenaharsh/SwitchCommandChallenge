package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        char alpha = 'F';

        switch(alpha){
            case 'A':
                System.out.println("The value is A");
                break;

            case 'B':
                System.out.println("The value is B");
                break;

            case 'C': case 'D': case 'E': case 'F':
                System.out.println("The value is C, D, E or F");
                break;

            default:
                System.out.println("The value is neither A, B, C, D, E");
                break;
        }

    }
}
