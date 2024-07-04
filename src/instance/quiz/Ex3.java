package instance.quiz;

public class Ex3 {

	public static void main(String[] args) {
		Book book1 = new Book();
		
		book1.bookName="자바프로그래밍";
		book1.bookPrice=20000;
		book1.Publisher="한빛컴퍼니";
		book1.bookPage=300;
		book1.showBookInfo();
		System.out.println(book1);
		
		Book book2 = new Book();
		
		book2.bookName="스프링";
		book2.bookPrice=15000;
		book2.Publisher="한빛컴퍼니"; 
		book2.bookPage=500;
		book2.showBookInfo();
		System.out.println(book2);
	}

}
