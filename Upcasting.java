package jbasicprogram;

class Animal {
	 public void sound() {
	     System.out.println("Animal makes a sound");
	 }
	}


	class Dog extends Animal {
	 @Override
	 public void sound() {
	     System.out.println("Dog barks");
	 }
	}


	class Cat extends Animal {
	 @Override
	 public void sound() {
	     System.out.println("Cat meows");
	 }
	}

	public class Upcasting 
	{
	 public static void main(String[] args) {
	     // Upcasting
	     Animal myDog = new Dog(); 
	     Animal myCat = new Cat(); 

	     
	     myDog.sound(); 
	     myCat.sound(); 

	 }

}
