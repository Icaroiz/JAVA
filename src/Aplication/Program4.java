package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Model.Entities.CarRental;
import Model.Entities.Vehicle;
import Model.Services.BrazilTaxService;
import Model.Services.RentalService;

public class Program4 {

	public static void main(String[] args) throws ParseException{
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter rental data: ");
		System.out.println("Car model: ");
		String carModel = sc.nextLine();
		System.out.print("Pickup: (DD/MM/YYYY HH:MM) ");
		Date start = sdf.parse(sc.nextLine());
		System.out.print("Return: (DD/MM/YY HH:MM)");
		Date finish = sdf.parse(sc.nextLine());
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Enter price per hour: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Enter price per day: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerDay,pricePerHour, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println();
		System.out.println("INVOICE ");
		System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		
		
		
		sc.close();
	}

}
