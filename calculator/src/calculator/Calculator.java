package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		/*
		 * Calculadora - Funciones a añadir
		 * Suma | Resta | Multiplicación | División - - Resto | Regla de Tres
		*/
		
		System.out.print("Calculator: ");
		Scanner reader=new Scanner(System.in);
		while(true) {
			System.out.println("Write the operation.");
			System.out.println("three → Rule of three");
			System.out.println("sum → sum");
			System.out.println("dif → Difference");
			System.out.println("mul → Multiply");
			System.out.println("div → Divide");
			System.out.println("rem → Remainder");
			System.out.println("quit → Exit");
			
			String operation=reader.nextLine();
						
			if(operation.equals("quit")) {
				break;
			}
			if(operation.equals("three")) {
				System.out.println("a → b");
				System.out.println("c → x");
				System.out.println("Enter the number of a, b, c");
				int a=Integer.parseInt(reader.nextLine());
				int b=Integer.parseInt(reader.nextLine());
				int c=Integer.parseInt(reader.nextLine());
				int mul=b*c;
				double res=(double)mul/a;
				System.out.println("x is "+res);
			}else {
				System.out.println("Enter the two numbers");
				
				int first=Integer.parseInt(reader.nextLine());
				int second=Integer.parseInt(reader.nextLine());
				
				
				if(operation.equals("sum")) {
					int sum=first+second;
					System.out.println("The sum of "+first+" + "+second+" = "+sum);
				}else if(operation.equals("dif")) {
					int dif=first-second;
					System.out.println("The difference of "+first+" - "+second+" = "+dif);
				}else if(operation.equals("mul")) {
					int mul=first*second;
					System.out.println("The multiplication of "+first+" x "+second+" = "+mul);
				}else if(operation.equals("div")) {
					double div=first/(double)second;
					System.out.println("The divide of "+first+" ÷ "+second+" = "+div);
				}else if(operation.equals("rem")) {
					int div=first/second;
					int rem=first%second;
					System.out.println("The divide of "+first+" ÷ "+second+" = "+div+" with a remainder of "+rem);
				}else {
					System.out.println("Unknown command.");
				}
			}
			
		}

		System.out.println("Exiting...");

	}

}
