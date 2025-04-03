package application;

import java.util.Date;

import aulas.enu01;
import entities.enums.OrderStatus;

public class Program01 {
	public static void main(String[] args) {
		
		enu01 order = new enu01(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(order);
		System.out.println();
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		System.out.println(os1);
		System.out.println(os2);
	}
}
