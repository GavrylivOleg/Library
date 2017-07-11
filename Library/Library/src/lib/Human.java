package lib;

public class Human {
	private int height;
	private int weight;
	private int age;
	public Human(int height, int weight, int age) {
		super();
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Human [height=" + height + ", weight=" + weight + ", age="
				+ age + "]";
	}
	
}
