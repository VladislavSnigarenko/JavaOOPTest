package Task_1;

public class Cat {

	private String name;
	private int age;
	private String color;
	private String voice = "Meou-Meou";
	
	public Cat(String name, int age, String color, String voice) {
		this.name = name;
		this.age = age;
		this.color = color;
		this.voice = voice;
	}

	public Cat(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public Cat() {
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	public void run() {
		System.out.println("Cat : " + name + " is running.");
	}

	public void stop() {
		System.out.println("Cat : " + name + " is stoped.");
	}
	
	public void voice() {
		System.out.println("Cat : " + name + " voice : " + voice);
	}

	public void setDefaultVoice() {
		voice = "Meou-Meou";
	}

	@Override
	public String toString() {
		return "Cat [name = " + name + ", age = " + age + ", color = " + color + "]";
	}
	
}
