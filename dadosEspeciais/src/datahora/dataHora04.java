package datahora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class dataHora04 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println();
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		System.out.println("Uma semana ANTES d04 = " + pastWeekLocalDate);
		System.out.println("Uma semana DEPOIS d04 = " + nextWeekLocalDate);
		System.out.println();
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		System.out.println("Uma semana ANTES d05 = " + pastWeekLocalDateTime);
		System.out.println("Uma semana DEPOIS d05 = " + nextWeekLocalDateTime);
		System.out.println();
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		System.out.println("Uma semana ANTES d06 = " + pastWeekInstant);
		System.out.println("Uma semana DEPOIS d06 = " + nextWeekInstant);
		System.out.println();
		
//		Calcula a duração de determinadas horas
		
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atTime(0, 0));
		System.out.println("Do dia pastWeekLocalDate para o dia d04: " + t1.toDays());
		
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		System.out.println("Do dia pastWeekLocalDateTime para o dia d05: " + t2.toDays());
		
		Duration t3 = Duration.between(pastWeekInstant, d06);
		System.out.println("Do dia pastWeekInstant para o dia d06: " + t3.toDays());
	}
}
