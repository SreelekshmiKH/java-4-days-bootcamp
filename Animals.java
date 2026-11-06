package Day2;



class Animal {
 String name;
 int age;

 
 Animal(String n, int a) {
     name = n;
     age = a;
 }

 void eat() {
     System.out.println(name + " is eating.");
 }

 void sleep() {
     System.out.println(name + " is sleeping.");
 }
}


class Dog extends Animal {

 Dog(String n, int a) {
     super(n, a);
 }

 void bark() {
     System.out.println(name + " is barking.");
 }
}


class Cat extends Animal {

 Cat(String n, int a) {
     super(n, a);
 }

 void meow() {
     System.out.println(name + " says Meow");
 }
}


public class Animals {
 public static void main(String[] args) {

     
     Dog d = new Dog("Tommy", 3);
     Cat c = new Cat("Kitty", 2);

     
     System.out.println("Dog Details");
     System.out.println("Name: " + d.name);
     System.out.println("Age: " + d.age);
     d.eat();
     d.sleep();
     d.bark();

     
     System.out.println("\nCat Details");
     System.out.println("Name: " + c.name);
     System.out.println("Age: " + c.age);
     c.eat();
     c.sleep();
     c.meow();
 }
}
