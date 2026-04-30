import java.util.*;
public class StringInputOutput{

    public static void printLetter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String arg[]){
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz@12345*&");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();

        // System.out.println("Our String name is " + name + " " + "and their length is " + name.length());


        // Concatenation

        String firstName = "MD";
        String lastName = "Asad";
        String fullName = firstName + " " + lastName;
        // System.out.println(fullName);
        printLetter(fullName);
    }
}