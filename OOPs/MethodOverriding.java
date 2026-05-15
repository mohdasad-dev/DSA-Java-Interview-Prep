// Parent and child classes both contains the same function with a different definition.

public class MethodOverriding{
    public static void main(String args[]){
        Deer d = new Deer();

        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eats anythings");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}