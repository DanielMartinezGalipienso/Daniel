package emailChanger;

import java.util.Scanner;


public class EmailChanger {

	public static void main(String[] args) {
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Escriba su email:");
		String email=reader.nextLine();
		//String email="danielma2@hotmail.com";
		int at=email.indexOf("@");
		String emailto=email.substring(0,at)+"@gmail.net";
		
		System.out.println("Su nuevo email es: "+emailto);
	}

}
