package exSecao11;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class EnumTeste {

	public static void main(String[] args) {
		
		Order order = new Order(1000, new Date(), OrderStatus.DELIVERED);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("Teste");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
