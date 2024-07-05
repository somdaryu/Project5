package constructor.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.bookName="스프링부트";
		book1.price=30000;
		book1.publisher="한빛출판사";
		book1.pageNumber=200;
		
		Book book2 = new Book("자바프로그래밍", 10000, "금빛출판사", 300);
		book1.showBookinfo();
		book2.showBookinfo();

	}

}

class Book {
	String bookName;
	int price;
	String publisher;
	int pageNumber;
	
	public Book() {
		super();
	}

	public Book(String bookName, int price, String publisher, int pageNumber) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.publisher = publisher;
		this.pageNumber = pageNumber;
	}
	
	public void showBookinfo() {
		System.out.println(bookName+", "+price+", "+publisher+", "+pageNumber);
	}
}
