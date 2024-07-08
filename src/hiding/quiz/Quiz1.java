package hiding.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.setName("자바프로그래밍");
		book1.setPrice(20000);
		book1.setPublisher("한빛컴퍼니");
		book1.setPage(300);
		
		book2.setName("스프링");
		book2.setPrice(15000);
		book2.setPublisher("한빛컴퍼니");
		book2.setPage(500);
		
		System.out.println(book1.getName()+", "+book1.getPrice()+", "+book1.getPublisher()+", "+book1.getPage());
		System.out.println(book2.getName()+", "+book2.getPrice()+", "+book2.getPublisher()+", "+book2.getPage());
	
	}

}

class Book {
	private String name;
	private int price;
	private String publisher;
	private int page;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}

}