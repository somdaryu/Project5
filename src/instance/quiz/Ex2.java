package instance.quiz;

public class Ex2 {

	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderNumber = 1111;
		order.orderDate = "2018년3월12일";
		order.orderName = "둘리";
		order.orderAddress = "서울시 영등포구 여의도동 20번지";
		
		order.showOrderInfo();
	}

}
