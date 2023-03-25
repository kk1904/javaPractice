package abstraction;
public class Dog extends Animal {
    @Override
    void makeSound() {      //implemented abstract method(make sound) here
        System.out.println("Bark-Bark");
    }
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.eat();
        d1.makeSound();
    }
}
