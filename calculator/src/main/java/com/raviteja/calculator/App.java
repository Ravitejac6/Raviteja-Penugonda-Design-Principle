package com.raviteja.calculator;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first operand :");
        float first_operand = scan.nextFloat();
        System.out.println("Enter the second operand :");
        float second_operand = scan.nextFloat();
        System.out.println("Enter the operation symbol you want to perform :");
        Character operator = scan.next().charAt(0);
        switch(operator) {
        	case '+' : Addition add = new Addition(first_operand,second_operand);
        				System.out.println(add.addTwoNumbers());
        				break;
        	case '-' : Subtraction sub = new Subtraction(first_operand,second_operand);
        				System.out.println(sub.subtractTwoNumbers());
        				break;
        	case '*' : Multiplication mul = new Multiplication(first_operand,second_operand);
						System.out.println(mul.multiplyTwoNumbers());
						break;
        	case '/' : Division div = new Division(first_operand,second_operand);
						System.out.println(div.divideTwoNumbers());
						break;
			default : System.out.println("Invalid Operation");
        }
    }
}
