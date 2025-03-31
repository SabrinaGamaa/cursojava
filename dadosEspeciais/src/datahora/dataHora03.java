package datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class dataHora03 {
	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("2025-03-28");
		LocalDateTime d02 = LocalDateTime.parse("2025-03-28T15:52:26");
		Instant d03 = Instant.parse("2025-03-28T01:30:26Z");
		
//		for (String s : ZoneId.getAvailableZoneIds()) {
//			System.out.println(s);
//		}
		
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		
		System.out.println("Local = " + r1);
		System.out.println("Portugal = " + r2);
		
		System.out.println();
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		
		System.out.println("Local com Hora = " + r3);
		System.out.println("Portugal com Hora = " + r4);
		
		System.out.println();
		System.out.println("d02 dia = " + d02.getDayOfMonth());
		System.out.println("d02 mês = " + d02.getMonthValue());
		System.out.println("d02 ano = " + d02.getYear());
		
	}
}
