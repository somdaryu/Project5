package method.quiz;

// 계산기 메소드를 만들고 호출하세요.
//
// 두 수와 연산자(+ - * /) 중에 하나를 입력받아,
// 연산을 수행하고 결과를 출력하세요.
//
// 예시) 1, 5, + => 6
//		6, 2, - => 4
//		2, 5, * => 10
//		10, 2, / => 5

public class Quiz6 {
	public static void calculator(int n1, int n2, char n3) {

//		switch (n3) {
//		case '+' :
//			System.out.println(n1+n2);
//			break;
//		case '-' :
//			System.out.println(n1-n2);
//			break;
//		case '*' :
//			System.out.println(n1*n2);
//			break;
//		case '/' :
//			System.out.println(n1/n2);
//			break;
//		}
		
		if(n3 == '+') {
			System.out.println(n1+n2);
		}else if(n3 == '-') {
			System.out.println(n1-n2);
		}else if(n3 == '*') {
			System.out.println(n1*n2);
		}else if(n3 == '/') {
			System.out.println(n1/n2);
		}else {
			System.out.println("+,-,*,/중 1개를 입력하세요");
		}
	}
	
	public static void main(String[] args) {
		calculator(4,5,'+');
		calculator(4,5,'-');
		calculator(4,5,'*');
		calculator(4,5,'/');
	}

}
