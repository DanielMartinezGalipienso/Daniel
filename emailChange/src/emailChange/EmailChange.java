package emailChange;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class EmailChange {

	public static void main(String[] args) {
		
		//Scanner reader=new Scanner(System.in);
		//String email=reader.nextLine();
		String email="danielma2@hotmail.com";
		int at=email.indexOf("@");
		String emailto=email.substring(0,at)+"gmail.net";
		
		System.out.println(emailto);
	}

}
