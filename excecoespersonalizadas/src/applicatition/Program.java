package applicatition;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//Lembrando que a solução muito ruim ela é feita dentro do programa - problema grave de delegação

import model.entities.Reservation;

public class Program {

//	Quando eu coloco "throws ParseException" que é um metedo que pode causar uma excesão
//	tem que tratar essa excesão, no metodo que estamos que é o main
	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room Number: ");
		int number = sc.nextInt();

		System.out.print("Check-in date (dd/mm/yyyy): ");
		Date checkIn = sdf.parse(sc.next());

		System.out.print("Check-out date (dd/mm/yyyy): ");
		Date checkOut = sdf.parse(sc.next());

//		AFTER checa uma data depois da outura
//		Se checkOut NÃO for DEPOIS de checkin da ERRO
		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after Check-in date.");
		}
		else {
			Reservation res = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + res.toString());
	
			System.out.println();
			System.out.println("Enter date to update the reservation: ");
			
			System.out.print("Check-in date (dd/mm/yyyy): ");
			checkIn = sdf.parse(sc.next());
	
			System.out.print("Check-out date (dd/mm/yyyy): ");
			checkOut = sdf.parse(sc.next());
	
			String error = res.updateDates(checkIn, checkOut);
			if (error != null) {
				System.out.println("Error in reservation: " + error);
			}
			else {
				System.out.println("Reservetion: " + res);
			}
		}
		
		sc.close();

	}

}
