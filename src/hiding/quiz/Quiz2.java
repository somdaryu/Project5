package hiding.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.setCompany("현대");
		car1.setModel("소나타");
		car1.setColor("흰색");
		car1.setSpeedMax(200);

		System.out.println(car1.getCompany()+", "+car1.getModel()+", "+car1.getColor()+", "+car1.getSpeedMax());

	}

}

class Car{
	private String company;
	private String model;
	private String color;
	private int speedMax;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeedMax() {
		return speedMax;
	}
	public void setSpeedMax(int speedMax) {
		this.speedMax = speedMax;
	}
}