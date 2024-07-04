package method.quiz;

//  두 수를 비교하는 함수를 만들고 호출하세요.
// 둘중에 더 큰수를 구하고 반환하세요.

public class Quiz3 {
	public static int pre(int n1, int n2) {
		if(n1 > n2) {
			return n1; //값을 반환, 함수종료
		}else {
			return n2;
		}
	} 

	public static void main(String[] args) {
		int prepare = pre(5, 5);
		System.out.println(prepare);
	}

}
