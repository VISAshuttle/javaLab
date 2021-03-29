package sec02_runtime_exception;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);

		Cat cat = new Cat();
		changeDog(cat); // cat은 Dog->Animal 업캐스팅된 적이 있어야 Animal->Dog 다운캐스팅이 가능
	}

	public static void changeDog(Animal animal) {
//		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
//		}
	}

}

//public class Animal { // The public type Animal must be defined in its own file
class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}