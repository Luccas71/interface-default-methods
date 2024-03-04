package app;

import java.util.Locale;

import service.BrazilInterestService;
import service.InterestService;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double amount = 200.0;
		int month = 3;

		InterestService bis = new BrazilInterestService(2.0);

		double totalPayment = bis.payment(amount, month);

		System.out.println("Valor a ser pago após " + month + " meses.");
		System.out.println("R$ " + String.format("%.2f",totalPayment));
	}

}
