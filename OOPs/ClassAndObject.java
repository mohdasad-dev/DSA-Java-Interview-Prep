public class ClassAndObject{
    public static void main (String args[]){
        // creating object.

        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);
    }
}


// In OOPs class blueprint

class Pen{
    // Properties + functions

    String color;
    int tip;

    void setColor(String newColor){
        color = newColor; 
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student {
    int name;
    int age;
    float percentage;


    void calcPercentage(int math, int chem, int phy){
        percentage = (math + phy + chem) / 3;
    }
}