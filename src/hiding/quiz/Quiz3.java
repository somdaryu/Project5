package hiding.quiz;

public class Quiz3 {

	public static void main(String[] args) {
		Mydate mydate = new Mydate();
		mydate.setMonth(2);
		mydate.setDay(28);
		
		System.out.println(mydate.getMonth()+"월 "+mydate.getDay()+"일");
	}

}

class Mydate {
	private int month;
	private int day;
	

	//월을 가져오는 메소드
	public int getMonth() { //리턴 O 매개변수 x 조회역할
		return month;
	}
	
	//일을 가져오는 메소드
	public int getDay() {
		return day;
	}
	
	//월을 변경하는 메소드
	public void setMonth(int month) { // 리턴 x 매개변수 O 수정역할
		if(month < 1 || month > 12) {
			System.out.println(month+"월은 잘못된 월입니다.");
			return;
		}
		this.month = month;
	}
	
	//일을 변경하는 메소드
	public void setDay(int day) {
		//새로 들어온 값이 올바른 일자인지 확인하고 저장 validation을 해야함.
		
		//2월인 경우, 일자가 1보다 작거나 28보다 크다면 저장안함
		if(month == 2) {
			if(day < 1 || day > 28) {
				System.out.println("2월에는"+day+"일이 없습니다.");
				return; //함수종료
			}	
		}
		this.day = day;
	}
}