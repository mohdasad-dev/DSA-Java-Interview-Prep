// 1). Find out the corrent statements to assign name to objects

// option :-

// a->name = "aman"
// Student.name = "aman"
// s.name = "Aman";

// public class Practices{
//     public static void main(String arg[]){
//         Student s = new Student();
//         s.name = "Aman";
//         System.out.println(s.name);
//     }
// }

// class Student{
//     String name;
//     int marks;
// }


// Answer:- s.name = "Aman";


// 2). which variable can the class Person access in the following code ?

// option :-

// name
// weights
// rollNUmber
// schoolName

// class Person{
//     String name;
//     int weights;
// }

// class Student extends Person{
//     int rollNUmber;
//     String schoolName;
// }


// Answer:- name weights

// 3). Which of the following modifiers are not allowed in front of class.

// option :-

// private
// protected
// default
// public

// Answer:- in java there is no any class will be private or protected if we make this then it will unusable. 



// 4). Which of the following is a correct statement ? (Both classes in same package);

// class Vechicle();
// class Car extends Vechicle();

// option :-

// Car c = new Car();
// Vechicle v = new Vechicle();
// Vechicle v = new Car();
// Car c = new Vechicle();

// Answer:-  Vechicle v = new Vechicle(), Car c = new Car() & Vechicle v = new Car();


// 5). what wil be th output of this code? (Both classes in same package)

// public class Practices{
//     public static void main(String arg[]){
//        Vechicle obj1 = new Car();
//        obj1.print();            // Here function overriding happen.


//        Vechicle obj2 = new Vechicle();
//        obj2.print();
//     }
// }

// class Vechicle{
//     void print(){
//         System.out.println("Base class (Vechicle)");
//     }
// }

// class Car extends Vechicle{
//     void print(){
//         System.out.println("Delivery class (Car)");
//     }
// }

// Answer:-  
// Delivery class (Car)
// Base class (Vechicle)


// 6). what wil be th output of this code? (Both classes in same package)

// public class Practices{
//     public static void main(String arg[]){
//        Vechicle obj1 = new Car();
//        obj1.print1();

//        Vechicle obj2 = new Vechicle();
//        obj2.print();
//     }
// }

// class Vechicle{
//     void print(){
//         System.out.println("Base class (Vechicle)");
//     }
// }

// class Car extends Vechicle{
//     void print1(){
//         System.out.println("Delivery class (Car)");
//     }
// }

// Answer:-   error: compilation failed.


// 7). Which of the following is not an OOPS conponents

// option :-

// Inheritance 
// Encapsulation
// Polymorphism
// Aggregation


// Answer:-  Aggregation


// 8).  what wil be th output of this code?

// option :-

// error
// 02
// 12
// 22

// public class Practices{
//     public static void main(String arg[]){
//       Book b1 = new Book(150);
//       Book b2 = new Book(250);
//       System.out.print("0" + Book.count); 
//     }
// }

// class Book{
//     int price;
//     static int count;

//     public Book(int price){
//         this.price = price;
//         count ++;
//     }
// }


// Answer: - 02



// 9).  which line has error.

// public class Practices{
//     public static void main(String arg[]){
//       Test t = new Test();
//       t.set_marks(98);
//       System.out.println(Test.marks);
//     }
// }

// class Test {
//     static int marks;
//     void set_marks(int marks){
//         this.marks = marks; 
//     }
// }


// Answer: - Here is no error the correct answer is 98.


// 10). What would be the output of the following code.

// public class Practices{
//     public static void main(String arg[]){
//       Test t = new Test();
//       t.changeB();
//       System.out.println(Test.a+Test.b);
//     }
// }

// class Test {
//     static int a = 10;
//     static int b;
//     static void changeB(){
//         b = a * 3;
//     }
// }

// Answer:- 40

// 11). Print the sum, difference and product of two complex numbers by creating a classnamed 'Complex' with separate methods for each operation whose real and imaginary parts  are entered by the user


import java.util.*;
public class Practices{
    public static void main(String arg[]){
      Complex c = new Complex(4, 5);
      Complex d = new Complex(5, 9);
      Complex e = Complex.add(c, d);
      Complex f = Complex.diff(c, d);
      Complex g = Complex.product(c, d);
      e.printComplex();
      f.printComplex();
      g.printComplex();
    }
}


class Complex{
    int real;
    int imag;
    public Complex(int r,int i){
        real = r;
        imag = i;
    }
    public static Complex add(Complex a,Complex b){
        return new Complex((a.real+b.real),(a.imag+b.imag));
    }
    public static Complex diff(Complex a,Complex b){
        return new Complex((a.real-b.real),(a.imag-b.imag));
    }
    public static Complex product(Complex a,Complex b){
        return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
    }
    public void printComplex(){
        if(real == 0 && imag != 0){
            System.out.println(imag+"i");
        }
        else if(imag == 0 && real != 0){
            System.out.println(real);
        }else{
            System.out.println(real+"+"+imag+"i");
        }
    }
}