package applicatition;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//Solução Boa - Tratamento de exceções

import model.entities.ReservationBoa;
import model.exception.DomainException;

public class ProgramBoa {

//Throws ParseExeption vai ser tratada agora, então não precisamos colocar ela no main
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.print("Room Number: ");
			int number = sc.nextInt();
	
			System.out.print("Check-in date (dd/mm/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
	
			System.out.print("Check-out date (dd/mm/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
	
			
			ReservationBoa res = new ReservationBoa(number, checkIn, checkOut);
			System.out.println("Reservation: " + res.toString());
	
			System.out.println();
			System.out.println("Enter date to update the reservation: ");
	
			System.out.print("Check-in date (dd/mm/yyyy): ");
			checkIn = sdf.parse(sc.next());
	
			System.out.print("Check-out date (dd/mm/yyyy): ");
			checkOut = sdf.parse(sc.next());
	
			res.updateDates(checkIn, checkOut);
			System.out.println("Reservetion: " + res);
		}
		
		catch (ParseException e) {
			System.out.println("Invalid date format!");
		}
		
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		
		catch (RuntimeException e) {
			System.out.println("Unexpected ERRO!");
		}

		sc.close();

	}

}
