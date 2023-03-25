package abstraction;
abstract class Animal {        //abstract class-which can have both abstract and non-abstract methods.
    abstract void makeSound(); //abstract method(so you can not implement here but you can implement in other class which extends abstract class)
    public void eat(){         //non-abstract method(you can implement as regular method)
        System.out.println("I can eat");
    }
}
