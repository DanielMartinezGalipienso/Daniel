package carExample;

public class Main {

	public static void main(String[] args) {


		//Creación de objetos Coche
		Car coche1=new Car("Nissan", "azul");
		Car coche2=new Car("Citroen", "naranja");
		
		System.out.println(coche1);
		coche1.acelerar(50);
		coche2.acelerar(100);
		System.out.println("Nueva velocidad de "+ coche1.getMarca() +" : "+ coche1.getVelocidad());
		System.out.println(coche2);
		coche2.frenar(30);
		System.out.println("Nueva velocidad de "+ coche2.getMarca() + " : " + coche2.getVelocidad());

	}

}
