package datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class dataHora02 {
	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2025-03-28");
		LocalDateTime d02 = LocalDateTime.parse("2025-03-28T15:52:26");
		Instant d03 = Instant.parse("2025-03-28T16:05:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d01 = " + d01.format(fmt1));
		System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println();
		System.out.println("d02 = " + fmt1.format(d02));
		System.out.println("d02 = " + d02.format(fmt2));
		System.out.println("d02 = " + d02.format(fmt4));
		System.out.println();
//		Como eu coloquei no d03 01:30Z horario UTC, ele já fez o calculo e me deu o horario local.
		System.out.println("d03 = " + fmt3.format(d03));
		System.out.println("d03 = " + fmt5.format(d03));
		System.out.println("d03 = " + d03.toString());
		
		
		
	}
}
