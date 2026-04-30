import java.util.*;
public class StringComparison{
    public static void main(String arg[]){
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1 == s2){
            System.out.println("Strings are equals");
        }else{
            System.out.println("Strings are not equal");
        }

        // if(s1 == s3){
        //     System.out.println("Strings are equals");
        // }else{
        //     System.out.println("Strings are not equal");
        // }

        if(s1.equals(s3)){
            System.out.println("Strings are equals");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}