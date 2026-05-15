public class HierarchicalInheritance{
    public static void main(String args[]){
        Bird chow = new Bird();
        chow.breathe();
    }
}


class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathe");
    }
}


class Mammal extends Animal{
    void walk(){
        System.out.println("walk");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}