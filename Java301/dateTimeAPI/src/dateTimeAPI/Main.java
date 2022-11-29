package dateTimeAPI;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		LocalDate localDate = LocalDate.now();
//		System.out.println(localDate);
//
//		LocalDate of = LocalDate.of(1990, 6, 22);
//		System.out.println(of);
//
//		LocalDate localDate2 = LocalDate.parse("2020-01-07");
//		System.out.println(localDate2);
//
//		System.out.println(localDate.plus(1, ChronoUnit.DAYS));
//		System.out.println(localDate.plusDays(2));
//
//		System.out.println(localDate.minus(1, ChronoUnit.MONTHS));
//		
//		LocalDate localDate3 = LocalDate.parse("2020-11-22");
//		System.out.println(localDate3.getDayOfWeek());
//		
//		int dayOfMonth = localDate3.getDayOfMonth();
//		System.out.println(dayOfMonth);
//		
//		LocalDate birinciTarih = LocalDate.parse("2020-01-20");
//		LocalDate ikinciTarih = LocalDate.parse("2020-01-25");
//		System.out.println(birinciTarih.isAfter(ikinciTarih));
//		System.out.println(birinciTarih.isBefore(ikinciTarih));

		Scanner scanner = new Scanner(System.in);
		System.out.print("Dogum Tarihi : ");
		String line = scanner.nextLine();
		LocalDate dogumTarihi = LocalDate.parse(line);
		System.out.println("Dogum Tarihiniz: " + dogumTarihi);
		System.out.println("Yasiniz: " + (LocalDate.now().getYear() - dogumTarihi.getYear()));

	}
}
