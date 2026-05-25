public class SuperKeywordDemo{
    public static void main(String arg[]){
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal{
    String color;
    Animal() {
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super.color = "brown";
         System.out.println("horse constructor is called");
    }
}