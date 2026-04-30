// import java.util.*;
// public class StringCompression{
//     public static String compress(String str){
//         String newStr = "";
//         for(int i=0; i<str.length(); i++){
//             Integer count = 1;
//             while(i<str.length()-1 && str.charAt(i+1)){
//                 count++;
//                 i++;
//             }
//             newStr += str.charAt();
//             if(count > 1){
//                 newStr += count.toString();
//             }
//         }
//     }
//     public static void main(String arg[]){
//         // String arr = "aaabbcccdd";
//         String arr = "abcd";
//         System.out.println(compress(arr));
//     }
// }



import java.util.*;

public class StringCompression {
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder(""); // Use StringBuilder for performance

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            // Compare current char with the next char
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String arg[]) {
        String arr1 = "aaabbcccdd";
        String arr2 = "abcd";
        System.out.println("Result 1: " + compress(arr1)); // a3b2c3d2
        System.out.println("Result 2: " + compress(arr2)); // abcd
    }
}
