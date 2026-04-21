// Print star Pattern like this :-

// *
// **
// ***
// ****


// public class Pattern{
//     public static void main(String arg[]){
//         for(int line=1; line<=4; line++){
//             for(int star=1; star<=line; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
// }


// Print inverted-star Pattern like this :-

// ****
// ***
// **
// *

// public class Pattern{
//     public static void main(String arg[]){
//         int n = 4;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=(n-i+1); j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



 
// Print half pyramid Pattern like this :-
// 1
// 12
// 123
// 1234

// public class Pattern{
//     public static void main(String arg[]){
//         int n = 4;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }



// Print Character Pattern like this :-
// A
// BC
// DEF
// GHIJ

// public class Pattern{
//     public static void main(String arg[]){
//         char ch = 'A';
//         int n = 4;
//         for(int line=1; line<=n; line++){
//             for(int data=1; data<=line; data++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }


//  by self Pattern chapter part(ii)


// Print inverted-half pyramid Pattern like this :-
// 12345
// 1234
// 123
// 12
// 1


// public class Pattern{
//     public static void main(String arg[]){
//         int n = 5;
//         for(int line=1; line<=n; line++){
//             for(int data=1; data<=n-line+1; data++){
//                 System.out.print(data);
                
//             }
//             System.out.println();
//         }
//     }
// }



// Floyd's triangle pattern


// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
public class Pattern{
    public static void main(String arg[]){
        int ch = 1;
        int n = 5;
        for(int line=1; line<=n; line++){
            for(int data=1; data<=line; data++){
                System.out.print(ch + " ");
                ch++;
                
            }
            System.out.println();
        }
    }
}