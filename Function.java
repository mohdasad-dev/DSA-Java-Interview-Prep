// let's learn Function in JAVA.
// Here is written in function syntax with Example.



// public class Function{
//     public static void printHelloWorld() {
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//     }
//     public static void main(String arg[]){
//         printHelloWorld();
//     }
// }



// Here is written in function syntax with parameter and  Example as well.


// import java.util.*;
// public class Function{

//     public static void calculateSum() {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println("sum is : " + sum);        
//     }

//     public static void main(String arg[]){
//         calculateSum();
//     }
// }



// import java.util.*;
// public class Function{

//     public static int calculateSum(int num1, int num2) {
//         int sum = num1 + num2;
//         return sum;
//     }
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculateSum(a, b);
//         System.out.println("sum is : " + sum);
//     }
// }


// call by value or swaping normal way.

// import java.util.*;
// public class Function{

//     public static void main(String arg[]){
//         // Swap - values exchanges.
//         int a = 5;
//         int b = 10;

//         // swap 
//         int temp = a;
//         a = b;
//         b=temp;
//         System.out.println("a : " + a);
//         System.out.println("b : " + b);
//     }
// }



// call by value by using function method swaping.

// import java.util.*;
// public class Function{

//     public static void swap(int a , int b){
//         int  tem = a;
//         a = b;
//         b = tem;
//         System.out.println("a : " + a);
//         System.out.println("b : " + b);
//     }

//     public static void main(String arg[]){
//         // Swap - values exchanges.
//         int a = 5;
//         int b = 10;

//         swap(a, b);
//     }
// }



// Find Product of a & b;


import java.util.*;
public class Function{

    public static void product(int a , int b){
        int mult = a*b;
        System.out.println("a : " + mult);
    }

    public static void main(String arg[]){
        // Swap - values exchanges.
        // int a = 5;
        // int b = 10;

        product(4, 9);
    }
}