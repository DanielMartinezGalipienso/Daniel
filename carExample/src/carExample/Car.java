package carExample;

public class Car {

		//Atribute
		private String marca;
		private int antiguedad;
		private int velocidad;
		private String color;
		
		
		//Constructor
		
		public Car(String marca, String color) {
			this.marca=marca;
			this.antiguedad=0;
			this.velocidad=0;
			this.color=color;
		}


		
		//toString
		

		@Override
		public String toString() {
			return "Car [marca=" + marca + ", antiguedad=" + antiguedad + ", velocidad=" + velocidad + ", color="
					+ color + "]";
		}
		
		//Getter and Setters
		

		public String getMarca() {
			return marca;
		}


		public void setMarca(String marca) {
			this.marca = marca;
		}


		public int getAntiguedad() {
			return antiguedad;
		}


		public void setAntiguedad(int antiguedad) {
			this.antiguedad = antiguedad;
		}


		public int getVelocidad() {
			return velocidad;
		}


		public void setVelocidad(int velocidad) {
			this.velocidad = velocidad;
		}


		public String getColor() {
			return color;
		}


		public void setColor(String color) {
			this.color = color;
		}
		
		//Metodos
		
		public void acelerar(int acelerado) {
			this.velocidad=this.velocidad+acelerado;
			
		}
		
		public void frenar(int frenado) {
			this.velocidad=this.velocidad-frenado;
		}
		
		public void years (int years) {
			this.antiguedad=this.antiguedad+years;
		}


}
