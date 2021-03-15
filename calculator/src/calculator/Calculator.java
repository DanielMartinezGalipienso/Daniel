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
				System.out.println("Exiting...");
				break;
			}
			System.out.println("Enter the numbers");
			
			int first=Integer.parseInt(reader.nextLine());
			int second=Integer.parseInt(reader.nextLine());
			
			if(operation.equals("three")){
				// System.out.println("a → b");
				// System.out.println("c → x");
				// System.out.println("Enter the number of a, b, c");
				int third=Integer.parseInt(reader.nextLine());
				System.out.println("X is "+three(first, second, third));
			}
			else if(operation.equals("sum")) {
				System.out.println("The sum of "+first+" + "+second+" = "+sum(first, second));
			}else if(operation.equals("dif")) {
				System.out.println("The difference of "+first+" - "+second+" = "+dif(first, second));
			}else if(operation.equals("mul")) {
				System.out.println("The multiplication of "+first+" x "+second+" = "+mul(first, second));
			}else if(operation.equals("div")) {
				System.out.println("The divide of "+first+" ÷ "+second+" = "+div(first, second));
			}else if(operation.equals("rem")) {
				System.out.println("The divide of "+first+" ÷ "+second+" = "+div(first, second)+" with a remainder of "+rem(first, second));
			}else {
				System.out.println("Unknown command.");
			}
			
		}


	}
	
	public static int sum(int first, int second) {
		return first+second;
	}
	public static int dif(int first, int second) {
		return first-second;
	}
	public static int mul(int first, int second) {
		return first*second;
	}
	public static double div(int first, int second) {
		return first/(double)second;
	}
	public static int rem(int first, int second) {
		return first%second;
	}
	public static double three(int first, int second, int third) {
		return ((first*third)/second);
	}

}
