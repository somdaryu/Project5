package method.quiz;

//  세자리 정수의 각 자리수의 합을 구하는 메소드를 만들고 호출하세요.
//  예시) 932 => 14 ( = 9 + 3 + 2)

public class Quiz7 {

	
	public static void hap(int n1) {
		int a1, a2, a3;
		a1 = n1/100; //100의자리
		a2 = (n1%100)/10; //10의자리
		a3 = n1%10; //1의자리
		System.out.println(a1+a2+a3);
	}
	
	public static void main(String[] args) {
		hap(932);
	}

}
