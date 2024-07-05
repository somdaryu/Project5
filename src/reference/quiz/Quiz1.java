package reference.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		Book book1 = new Book("책1", 10000, "한빛출판사", 100);
		Book book2 = new Book("책2", 20000, "금빛출판사", 200);
		Book book3 = new Book("책3", 30000, "은빛출판사", 150);
		
		Member member = new Member(1, "또치", book1, book2, book3);

	}

}
class Book{
	String bookName;
	int price;
	String publisher;
	int pageNumber;
	
	public Book(String bookName, int price, String publisher, int pageNumber) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.publisher = publisher;
		this.pageNumber = pageNumber;
	}
}

class Member{
	int num;
	String memberName;
	Book book1;
	Book book2;
	Book book3;
	public Member(int num, String memberName, Book book1, Book book2, Book book3) {
		super();
		this.num = num;
		this.memberName = memberName;
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
	}
}
