package creditCar;

public class Main {

	public static void main(String[] args) {
		
		// Préstamo - Interés - Meses
		CreditCar cc1 = new CreditCar(22000, 4, 24);
		CreditCar cc2 = new CreditCar(76000, 7, 36);
		
		System.out.println(cc1);
		cc1.payMonth(22000);
		System.out.println(cc1);
		cc1.payMonth(cc1.paymentMonth);
		cc1.payMonth(cc1.paymentMonth);
		cc1.payMonth(953.3333333333334);
		cc1.payMonth(cc1.paymentMonth);
		
		System.out.println(cc2);
		cc1.payMonth(1150.72);
		
		System.out.println(cc1);
		System.out.println(cc2);
		
		
		// Pruebas de pago total
		cc2.payAll(81320.0);
		System.out.println(cc2);
		cc2.payAll(cc2.credit);
		System.out.println(cc2);
		

	}

}
