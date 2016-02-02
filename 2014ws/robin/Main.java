package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class Animal {
    private int age;

    Animal() {

    }

    void setAge(int age) {
        this.age = age;
    }

    abstract void makeNoise();
}

class Cow extends Animal {

	@Override
	void makeNoise() {
		System.out.println("Muh");
	}

}

class Dog extends Animal {
	void makeNoise() {
		System.out.println("WOOOF");
	}

	int test() {
		return 0;
	}
}

class Cat extends Animal {
	void makeNoise() {
		System.out.println("Miaue");
	}
}

public class Main {
	public static void main(String[] args) {
		Animal[] animals = { new Cat(), new Dog() };
		List<Animal> list = new ArrayList<Animal>();
		list.add(new Cat());
		for (Animal animal : animals) {
			animal.makeNoise();
		}
	}
}