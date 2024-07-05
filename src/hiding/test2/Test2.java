package hiding.test2;

public class Test2 {

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "둘리"; //어디서나 ok
		person.height = 170; //같은패키지 ok
		// person.weight 몸무게는 클래스 외부에서 사용 불가
	}

}

class Person {
	public String name;
	int height;
	private double weight;
	public void shoInfo() {
		System.out.println("이름:"+name+"키: "+height+"몸무게: "+weight);
	}
}
