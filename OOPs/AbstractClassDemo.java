public class AbstractClassDemo{
    public static void main(String arg[]){

        Mustang myHorse = new Mustang();
        //  Animal -> Horse -> Mustang

        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.walk();
        // c.eat();
    }
}


abstract class Animal{
    String color;

    Animal() {
        System.out.println("Animal constructors called");
    }
    void eat(){
        System.out.println("eats anythings");
    }

    abstract  void walk();
}

class Horse extends Animal{

    Horse() {
        System.out.println("Animal constructors called");
    }

    void changeColor() {
        color = "dark brown";
    }

    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{

    Mustang() {
        System.out.println("Mustang constructors called");
    }
}
class Chicken extends Animal{

    void changeColor() {
        color = "Yellow";
    }

    void walk(){
        System.out.println("walks on 2 legs");
    }
}