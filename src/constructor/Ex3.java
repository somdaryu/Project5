package constructor;

public class Ex3 {
	
}

class board {
	int no;
	String title;
	String content;
	String writer;
	
	public board(int no, String title, String content, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	

	public board(int no) {
		super();
		this.no = no;
	}


	public board(int no, String title) {
		super();
		this.no = no;
		this.title = title;
	}


	public board() { //디폴트 생성자
		super();
	}
	
	
}