public class HybridInheritance{
    public static void main(String args[]){
        Human inlog = new Human();
        inlog.walk();
    }
} 

class Animal{
    String color;

    void eat(){
        System.out.println("eat");
    }

    void breathe(){
        System.out.println("breathe");
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

class Mammal extends Animal{
    void walk(){
        System.out.println("walk");
    }
}

class Tuna extends Fish{
    void taste(){
        System.out.println("tasty yamm...");
    }
}

class Dolphin extends Fish{
    void taste(){
        System.out.println("Playing football");
    }
}

class peacock extends Bird{
    void taste(){
        System.out.println("gorgeious");
    }
}

class Human extends Mammal{
    void taste(){
        System.out.println("Sense");
    }
}