package creditCar;

public class CreditCar {
	
	
	//ATTRIBUTE
	
	// Préstamo | Interés | Meses
	double lending;
	int interest;
	int months;

	// Préstamo total a pagar | Pago restante
	// Pago mensual | Meses restantes
	double totalLoan;
	double credit;
	double paymentMonth;
	int monthsRemaining;
	
	
	//CONSTRUCTOR
	
	public CreditCar(int lending, int interest, int months){
		this.lending = lending;
		this.interest = interest;
		this.months = months;
		this.totalLoan = lending + (lending*interest)/100;
		this.credit = this.totalLoan;
		this.paymentMonth = this.totalLoan/months;
		this.monthsRemaining = this.months;
	}
	

	//toString
	

	@Override
	public String toString() {
		return "CreditCar [lending=" + lending + ", interest=" + interest + ", months=" + months + ", totalLoan="
				+ totalLoan + ", credit=" + credit + ", paymentMonth=" + paymentMonth + ", monthsRemaining="
				+ monthsRemaining + "]";
	}
	

	//Getter and Setters	


	public double getLending() {
		return lending;
	}

	public void setLending(double lending) {
		this.lending = lending;
	}

	public int getInterest() {
		return interest;
	}

	public void setInterest(int interest) {
		this.interest = interest;
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public double getTotalLoan() {
		return totalLoan;
	}

	public void setTotalLoan(double totalLoan) {
		this.totalLoan = totalLoan;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public double getPaymentMonth() {
		return paymentMonth;
	}

	public void setPaymentMonth(double paymentMonth) {
		this.paymentMonth = paymentMonth;
	}

	public int getMonthsRemaining() {
		return monthsRemaining;
	}

	public void setMonthsRemaining(int monthsRemaining) {
		this.monthsRemaining = monthsRemaining;
	}
	
	
	//METHODS
	
	//Pago mensual
	public void payMonth (double pay) {
		if (this.paymentMonth == pay) {
			
			//Pago de 1 mes
			this.credit = this.credit - pay;
			this.monthsRemaining = this.monthsRemaining - 1;
			
			
			
		} else {
			//En caso de un pago no acorde al mensual
			return;
		}
	}
	
	public void payAll (double pay) {
		
		if (pay == this.credit) {
			this.credit = 0;
			this.monthsRemaining = 0;
		}
	}
	
	/*
	
	public void payMonths (double pay) {
		if (pay % this.paymentMonth == 0) {
			
			//Pago de varios meses - No funciona
			this.credit = this.credit - pay;
			
			//Ajustar meses restantes
			double payments = (pay / this.paymentMonth);
			while (payments > 0) {
				this.monthsRemaining = this.monthsRemaining - 1;
				payments = payments - 1;
			}
		}
	}
	*/
	

}
