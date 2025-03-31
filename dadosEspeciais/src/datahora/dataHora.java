package datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class dataHora {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		LocalDate data01 = LocalDate.now();
		LocalDateTime dataHora01 = LocalDateTime.now();
		
		System.out.println("    LocalData     ");
		System.out.println("Data Atual: " + data01);
		System.out.println("Data e Hora Atual: " + dataHora01);
		
		LocalDate data03 = LocalDate.parse("2024-03-28");
		LocalDateTime data04 = LocalDateTime.parse("2024-03-28T13:22:09");
		System.out.println("Data Digitada: " + data03);
		System.out.println("Data e Hora Digitada: " + data04);
		
		System.out.println("------------------------------------------");
		System.out.println("    Instant     ");
		
		Instant data02 = Instant.now();
		System.out.println("Data e Hora UTC Atual: " + data02.toString());
		
		Instant data05 = Instant.parse("2025-03-28T13:22:09Z");
		System.out.println("Data e Hora Digitada: " + data05);
		
		Instant data06 = Instant.parse("2025-03-28T13:22:09-03:00");
		System.out.println("Calcular Data e Hora: " + data06);
		
		System.out.println("--------------------------------------------");
		System.out.println("   Formatações    ");
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate data07 = LocalDate.parse("20/07/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("data07 = " + data07);
		LocalDate data08 = LocalDate.parse("20/07/2025 01:30", fmt2);
		System.out.println("data08 = " + data08);
		
		System.out.println("--------------------------------------------");
		LocalDate data09 = LocalDate.of(2025, 7, 28);
		LocalDateTime data10 = LocalDateTime.of(2025, 7, 28, 03, 20);
		
		System.out.println("data09 " + data09);
		System.out.println("data10 " + data10);
		
		sc.close();
	}
}
