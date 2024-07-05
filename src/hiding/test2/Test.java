package hiding.test2;

import hiding.test1.A;

public class Test {

	public static void main(String[] args) {
		A a = new A(); //접근제어자가 public이기 떄문에 임포트 후 외부패키지에서 사용 가능
		// B b = new b(); default 접근제어자는 내부에서만 사용 가능 외부 사용 불가
	}

}
