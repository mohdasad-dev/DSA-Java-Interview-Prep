public class Inheritance{
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
    }
}

// Base 
class Animal{
    String color;

    void eat(){
        System.out.println("eat");
    }

    void breathe() {
        System.out.println("breathe");
    }
}


// Derived class  / sub-class

// here extends key will extract all the featers from the Base class.

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}