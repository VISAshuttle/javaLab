package sec08.exam02_abstract_method;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("----------");
		
		// 지역변수의 자동 형변환
		Animal animal = new Dog(); // 자식(실체)->부모(추상) 업캐스팅
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("----------");
		
		// 매개변수의 자동 형변환
		animalSound(dog);
		animalSound(cat);
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
