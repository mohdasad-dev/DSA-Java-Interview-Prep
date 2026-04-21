// public class JavaBasics {
//     public static void main(String arg[]) {
//         System.out.println("Hello World!");  // line ka space
//         System.out.println("Hello World!");  // line ka space
//         System.out.println("Hello World!");  // line ka space
//         System.out.println("Hello World!");  // line ka space
//         System.out.println("****");
//         System.out.println("***");
//         System.out.println("**");
//         System.out.println("*");
//     }
// }



//  Variable in Java 
// public class JavaBasics{
//     public static void main(String arg[]) {
//         int a = 10;
//         int b = 15;
//         System.out.println(a);
//         System.out.println(b);

//         String name = "Tony Stark";
//         System.out.println(name);
//         a = b;
//         System.out.println(a);
//     }
// }



// Data type in Java Primitive

// public class JavaBasics{
//     public static void main(String arg[]) {
//         byte b = 8;
//         System.out.println(b);

//         char ch = 'a';
//         System.out.println(ch);

//         boolean var = false;
//         float price = 10.5f;
//         int num = 25;
//         // long
//         double price2 = 10.5;

//         short n = 20;
//     }
// }



// Sum of two number.

// public class JavaBasics{
//     public static void main(String arg[]) {
//         int a = 10;
//         int b = 20;
//         int sum = a + b;
//         System.out.println(sum);
//     }
// }



// input in java
// import java.util.*;

// public class JavaBasics{
//     public static void main(String arg[]) {
//         Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);


        // String name = sc.nextLine();
        // System.out.println(name);

        // int number = sc.nextInt();
        // System.out.println(number);

        // float price = sc.nextFloat();
        // System.out.println(price);

        // Sum of a & b

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println(sum);

        // Product of a & b

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int product = a * b;
        // System.out.println(product);


        //  Area of a Circle 

        // float rad = sc.nextFloat();
        // float area = 3.14f * rad * rad;
        // System.out.println(area);
//     }
// }




// Type conversion:- On Java it allow us to small to large data type

// import java.util.*;
// public class JavaBasics{
//     public static void main(String arg[]){
        // int a = 23;
        // long b = a;

        // long a =55;
        // int b = a;
        // System.out.println(b);

        // Scanner sc = new Scanner(System.in);
        // float number = sc.nextInt();
        // System.out.println(number);

//         char ch = 'a';
//         int number = ch;
//         System.out.println(number);
//     }
// }



// Type Casting:- On Java it allow us to large to small data type by forcefully.

// import java.util.*;
// public class JavaBasics{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);

//         float a = 25.12f;
//         int b = (int)a;
//         System.out.println(b);
//     }
// }



//  Type Promotion in expression.

// import java.util.*;

// public class JavaBasics{
//     public static void main(String arg[]){
//         char a = 'a';
//         char b = 'b';
//         System.out.println((int)(a));
//         System.out.println((int)(b));
//         System.out.println(b-a);

//     }
// }


// Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers.

// import java.util.*;

// public class JavaBasics{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int avg = (a + b + c ) / 3;
//         System.out.println("Avearge is : " + avg);
//     }
// }

// Practce 2
// Question is :- In a program, input the side of a square.You have to output the area of the square.


// import java.util.*;

// public class JavaBasics{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);

//         int side = sc.nextInt();
//         int area = side * side;
//         System.out.println("area of a square is : " + area);
//     }
// }


// Practce 3
// Enter cost of 3 items from the user (usingfloatdatatype)-a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bills.



// import java.util.*;
// public class JavaBasics{
//     public static void main (String arg[]){
//         Scanner sc = new Scanner(System.in);
//         float pencil = sc.nextFloat();  
//         float pen = sc.nextFloat();  
//         float eraser = sc.nextFloat();  
//         float totalprice = pencil + pen + eraser;
//         System.out.println("Total bill is : " + totalprice);

//         // Add on :- with 18% tax

//         float newTotal = totalprice + (0.18f * totalprice);
//         System.out.println("Bill with 18% tax : "+newTotal);
//     }
// }






// Arthimetic Operator.


// public class JavaBasics{
//     public static void main(String arg[]){
//         int A = 20;
//         int B = 10;
//         System.out.println("Add = " + (A+B));
//         System.out.println("Sub = " + (A-B));
//         System.out.println("Multiple = " + (A*B));
//         System.out.println("Divide = " + (A/B));
//         System.out.println("Modulo = " + (A%B));
//     }
// }


// Unary Operator.

// Example of Pre Incremental Unary operator

// public class JavaBasics{
//     public static void main(String arg[]){
//         int a = 10;
//         int b = ++a;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }


// Example of Post Incremental Unary operator

// public class JavaBasics{
//     public static void main(String arg[]){
//         int a = 10;
//         int b = a++;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }



// Example of Pre decrement Unary operator

// public class JavaBasics{
//     public static void main(String arg[]){
//         int a = 10;
//         int b = --a;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }


// Example of Post decrement Unary operator

// public class JavaBasics{
//     public static void main(String arg[]){
//         int a = 10;
//         int b = a--;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }




// Relational operator

// public class JavaBasics{
//     public static void main(String arg[]){
//         int a = 10;
//         int b = 6;
//         System.out.println((a == b));
//         System.out.println((a != b));
//         System.out.println((a > b));
//         System.out.println((a < b));
//         System.out.println((a >= b));
//         System.out.println((a <= b));
//     }
// }



// Logical operator

// public class JavaBasics{
//     public static void main(String arg[]){
        //System.out.println( (3>2) && (5>0));   // Logcal AND
        //System.out.println( (3>2) || (5>9));    // Logcal OR
        //System.out.println( !(0>2));            // Logcal NOT
//     }
// }



// Assignment operator

// public class JavaBasics{
//     public static void main(String arg[]){
        // int a = 10;
        // System.out.println( (a+=10));      // a = a + 10
        // int b = 10;
        // System.out.println( (b-=10));      // b = b - 10
        // int c = 10;
        // System.out.println( (c*=10));      // c = c * 10    
       //  int d = 10;
       //  System.out.println( (d/=10));      // d = d / 10 

        // int e = 10;   
        // System.out.println( (e%=10));      // e = e / 10 
//     }
// }



// Conditional statement.

// if-else 

// public class JavaBasics{
//         public static void main(String arg[]){
//                 int age = 15;
//                 if(age>= 18){
//                         System.out.println(" Adult : You can vote, drive");
//                 }

//                 if(age >= 13 && age < 18){
//                         System.out.println("Teenager");
//                 }
//                 else{
//                         System.out.println(" not adult");
//                 }
//         }
// }


// Print the lagest  of 2 number

// public class JavaBasics{
//         public static void main(String arg[]){
//                 int a = 1;
//                 int b = 3;
//                 if(a>=b){
//                         System.out.println(a);
//                 }else{
//                         System.out.println(b);
//                 }
//         }
// }

//Print if a number is odd or even.

// public class JavaBasics{
//         public static void main(String arg[]){
//                 int a = 4;
//                 if(a % 2 == 0){
//                         System.out.println("even");
//                 }else{
//                         System.out.println("not even");
//                 }
//         }
// }


// import java.util.*;
// public class JavaBasics{
//         public static void main(String arg[]){
//                 Scanner sc = new Scanner(System.in);
//                 int num = sc.nextInt();
              
//                 if(num % 2 == 0){
//                         System.out.println("Even");
//                 }else{
//                         System.out.println("Odd");
//                 }
//         }
// }




// else-if


// public class JavaBasics{
//         public static void main(String arg[]){
//                 int age = 10;
//                 if(age>=18){
//                         System.out.println("Adult");
//                 }else if(age<18 && age >= 13){
//                         System.out.println("Teenager");
//                 }else{
//                         System.out.println("Child");
//                 }
//         }
// }


//  Income tax calculator.

// import java.util.*;
// public class JavaBasics{
//         public static void main(String arg[]){
//                 Scanner sc = new Scanner(System.in);
//                 int income = sc.nextInt();
//                 int tax;

//                 if(income < 500000){
//                         tax = 0;
//                 }else if(income >=500000 && income <1000000){
//                         tax = (int)(income * 0.2);
//                 }else{
//                         tax = (int)(income * 0.3);
//                 }
//                 System.out.println("Your tax is : " + tax);
//         }
// }



// print he largest of 3  number.

// public class JavaBasics{
//         public static void main(String arg[]){
//                 int a = 1;
//                 int b = 3;
//                 int c = 6;
//                 if((a>=b) && (a>=c)){
//                         System.out.println(a);
//                 }else if(b>=c){
//                         System.out.println(b);
//                 }else{
//                         System.out.println(c);
//                 }
//         }
// }




//  uses of Ternary operator.

// public class JavaBasics{
//         public static void main(String arg[]) {
//                 int number = 5;

//                 // Ternary Operator

//                 String type = ((number % 2 == 0)) ? "even " : "odd";
//                 System.out.println(type);
//         }
// }



// Ternary Operator

// public class JavaBasics{
//         public static void main(String arg[]) {
//                 int marks = 33;
//                 String Status = ((marks >=  33)) ? "Pass " : "fail";
//                 System.out.println(Status);
//         }
// }


// Switch Statement.

// public class JavaBasics{
//         public static void main(String arg[]){
//                 int number = 1;
//                 switch(number){
//                         case 1: System.out.println("samosa");
//                         break;
//                         case 2: System.out.println("burger");
//                          break;
//                         case 3: System.out.println("mango shake");
//                          break;
//                         case 4: System.out.println("litchi");
//                          break;
//                         default: System.out.println("we reliaze we are in dreaming");
//                 }
//         }
// }





// calculator using switch Statement.



// import java.util.*;
// public class JavaBasics{
//         public static void main(String arg[]){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("enter a :");
//                 int a = sc.nextInt();
//                 System.out.println("enter b :");
//                 int b = sc.nextInt();
//                 int operator = sc.next().charAt(0);

//                 switch(operator){
//                         case '+' : System.out.println(a + b);
//                         break;
//                         case '-' : System.out.println(a - b);
//                         break;
//                         case '*' : System.out.println(a * b);
//                         break;
//                         case '/' : System.out.println(a / b);
//                         break;
//                         case '%' : System.out.println(a % b);
//                         break;
//                         default: System.out.println("Not find valid operator");
//                 }
//         }
// }



//  Practice questions.

// Question1

// import java.util.*;
// public class JavaBasics{
//         public static void main(String arg[]){
//                 Scanner sc = new Scanner(System.in);
//                 int a = sc.nextInt();
//                 if(a>=0){
//                         System.out.println("Positive");
//                 }else{
//                         System.out.println("Negative");
//                 }
//         }
// }

// Question 2.


// public class JavaBasics{
//         public static void main(String arg[]){    
//                 double temp = 103.5;
//                 if(temp > 100){
//                         System.out.println("You have Fever");
//                 }else{
//                         System.out.println("You have Fever");
//                 }

//         }
// }



// Question 3.

// import java.util.*;
// public class JavaBasics{
//         public static void main(String arg[]){
//                Scanner sc = new Scanner(System.in);
//                System.out.println("Enter week number(1 - 7) :   ");
        
//                int  week = sc.nextInt();

//                switch(week){
//                 case 1: System.out.println("Monday");
//                 break;
//                 case 2: System.out.println("Tuesday");
//                 break;
//                 case 3: System.out.println("Wednesday");
//                 break;
//                 case 4: System.out.println("Thursday");
//                 break;
//                 case 5: System.out.println("Friday");
//                 break;
//                 case 6: System.out.println("Saturday");
//                 break;
//                 case 7: System.out.println("Sunday");
//                 break;
//                }
//         }
// }


//  Question 4.

// public class JavaBasics{
//         public static void main(String arg[]){
//                 int a = 63, b= 36;
//                 boolean x = (a <b) ? true : false;
//                 System.out.println(x);
//                 int y = (a>b) ?a :b;
//                 System.out.println(y);
//         }
// }

//  Question 5.

// import java.util.*;
// public class JavaBasics{
//         public static void main(String arg[]){
//                 Scanner sc = new Scanner(System.in);

//                 System.out.println("Input the Year :");
//                 int year = sc.nextInt();
                
//                 boolean x = (year % 4) == 0;
//                 boolean y = (year % 100) != 0;
//                 boolean z = ((year % 100==0) && (year % 400 == 0));
//                 if(x && (y||z)) {
//                         System.out.println(year+" is a leap year");
//                 }else{
//                         System.out.println(year+" is not a leapyear");
//                 }
//         }
// }





// Loop concept in JAVA.

// public class JavaBasics{
//         public static void main(String arg[]){
//                 int counter = 0;
//                 while(counter < 10){
//                         System.out.println("HEllo World!");
//                         counter++;
//                 }

//                 System.out.println("Printed HW 10x");
//         }
// }



// Print number from 1 to 10.


// public class JavaBasics{
//         public static void main(String arg[]){
//                 int number = 1;
//                 while(number <= 10){
//                         System.out.println(number);
//                         number++;
//                 }
//         }
// }




// Print number from 1 to n.

// import java.util.*;
// public class JavaBasics{
//         public static void main(String arg[]){
//                 Scanner sc = new Scanner(System.in);

//                 System.out.println("Enter Your number");
//                 int n = sc.nextInt();
//                 int number = 1;

//                 while(number <= n){
//                         System.out.println(number);
//                         number++;
//                 }
//         }
// }



// Print sum of first n natural numbers.

// import java.util.*;
// public class JavaBasics{
//         public static void main(String arg[]){
//                 Scanner sc = new Scanner(System.in);

//                 System.out.println("Enter Your number");
//                 int n = sc.nextInt();
//                 int sum = 0;
//                 int i = 1;

//                 while(i <= n){
//                          sum+=i;
//                         i++;
//                 }
//                 System.out.println("sum of first n numbers : " + sum);
//         }
// }



// for loop concept 


// public class JavaBasics{
//         public static void main(String arg[]){
//                 for(int i=1; i<=5; i++){
//                         System.out.println("Hello World");
//                 }
//         }
// }




// ****
// ****
// ****
// **** print these square pattern.


// public class JavaBasics{
//         public static void main(String arg[]){
//                 for(int i=1; i<=4; i++){
//                         System.out.println("****");
//                 }
//         }
// }



// Print Reverse of a Number:- 10899

// public class JavaBasics{
//         public static void main(String arg[]){
//                 int n = 2345670;
//                 while(n >0 ){
//                         int lastDigits = n % 10;
//                         System.out.print(lastDigits);
//                         n = n / 10;
                        
//                 }
//                 System.out.println();
//         }
// }




// Reverse the given number.

// public class JavaBasics{
//         public static void main(String arg[]){
//                 int n = 10899;
//                int rev = 0;

//                while(n > 0){
//                 int lastDigits = n % 10;
//                 rev = (rev*10) + lastDigits;
//                 n = n/10;
//                }
//                System.out.println(rev);
//         }
// }


//  Concept of do-while Loop in JAVA;

// public class JavaBasics{
//         public static void main(String arg[]){
//                 int n = 1;
//                 do{
//                         System.out.println("Hello World");
//                         n++;
//                 }while(n<=5);
//         }
// }



// Concept of break in Loop for Java.

// public class JavaBasics{
//         public static void main(String arg[]){
//                 for(int i=1; i<= 5; i++){
//                         if(i == 3){
//                                 break;
//                         }
//                         System.out.println(i);
//                 }

//                 System.out.println(" I am out of the loop");
//         }
// }





// Keep entering the number till user enters a multiple of 10.



// import java.util.*;

// public class JavaBasics{
//         public static void main(String arg[]){
//                 Scanner sc = new Scanner(System.in);           

//                 do{
//                         System.out.println("Enter You number which is divisible by 10");
//                         int num  = sc.nextInt();
//                         if(num%10 == 0){
//                                 break;
//                         }
//                         System.out.println(num);
//                 }while(true);              
//         }
// }




// Concept of Continues in Loop for Java.

// public class JavaBasics{
//         public static void main(String arg[]){
//                 for(int i=1; i<=5; i++){
//                         if(i == 3){
//                                 continue;
//                         }
//                         System.out.println(i);
//                 }
//         }
// }

// Display all numbers entered by user except  multiple of  10;


// import java.util.*;
// public class JavaBasics{
//         public static void main(String arg[]){
//                Scanner sc = new Scanner(System.in);

//                do{
//                 System.out.println("Enter your number whic is multer of 10");
//                 int num = sc.nextInt();
//                 if(num%10==0){
//                         continue;
//                 }
//                 System.out.println("number was : " + num);
//                }while(true);
//         }
// }


// Practice No 01.
//Check if a number is prime or not.

// import java.util.*;
// public class JavaBasics{
//         public static void main(String arg[]){
//                 Scanner sc = new Scanner(System.in);

//                 System.out.println("Enter your number which is prime or not :");
//                 int n = sc.nextInt();

//                 if(n == 2){
//                         System.out.println("n is Prime ");
//                 }else{
//                         boolean isPrime = true;
//                         for(int i=2; i<=(n-1); i++){
//                                 if(n%i==0){
//                                         isPrime = false;
//                                 }
//                         }

//                         if(isPrime == true){
//                                 System.out.println("n is Prime");
//                         }else{
//                                 System.out.println("n is not Prime");
//                         }
//                 }                
//         }
// }


// Practice No 02
// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

// import java.util.*;
// public class JavaBasics{
//         public static void main(String arg[]){
//                 Scanner sc = new Scanner(System.in);

//                 int number;
//                 int choice;
//                 int oddSum = 3;
//                 int evenSum = 2;

//                 do{
//                         System.out.print("Enter you number : ");
//                         number = sc.nextInt();


//                         if(number % 2 == 0){
//                                 evenSum += number;
//                         }else{
//                                 oddSum += number;
//                         }
//                         System.out.print("Do you want to continue ? Press 1 for yes 0 for no");

//                         choice = sc.nextInt();
//                 }while(choice == 1);

//                 System.out.println("Sum of odd number : " + oddSum);
//                 System.out.println("Sum of even number : " + evenSum);
//                 sc.close();
//         }
// }


// Practice No 03
// Write a program to print the multiplication table of a number N, entered by the user.

// import java.util.*;
// public class JavaBasics{
//         public static void main(String arg[]){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter a number : ");
//                 int n = sc.nextInt();
//                 for(int i=1; i<=10; i++){
//                         System.out.println(n + " * " + i + " = " + n*i);
//                 }
//         }
// }




// Practice No 04
// Write a program to find the factorialof any number entered by the user


import java.util.*;
public class JavaBasics{
        public static void main(String arg[]){
                Scanner sc = new Scanner(System.in);

                int num;
                int fact = 1;

                System.out.println("Enter any Positive integer :");
                num = sc.nextInt();

                for(int i = 1; i<=num; i++){
                        fact *= i;
                }
                System.out.println(fact);
        }
}