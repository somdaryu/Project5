package instance.quiz;

public class Order {
	int orderNumber;
	String orderDate;
	String orderName;
	String orderAddress;
	
	public void showOrderInfo() {
		System.out.println("주문번호: "+orderNumber);
		System.out.println("주문날짜: "+orderDate);
		System.out.println("주문자이름: "+orderName);
		System.out.println("배송지: "+orderAddress);
	}
}

