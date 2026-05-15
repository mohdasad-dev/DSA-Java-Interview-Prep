public class SingleInheritance{
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
    }
}

// Base Class

class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathe");
    }
}


// Derived class :- It is also known as child or sub-Class



// here extends key will extract all the featers from the Base class.

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}