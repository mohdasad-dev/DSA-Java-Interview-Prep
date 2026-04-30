// for a given String Convert each the first letter of first word  to uppercase

import java.util.*;

public class UppercaseConversion {
    public static String toUpperCase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder sb = new StringBuilder("");

        // Fix 1: Properly capitalize the very first character
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            // Fix 2: Correct charAt syntax and check for spaces
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i)); // append the space
                i++; // move to the letter after space
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                // Fix 3: Use sb.append instead of str.append
                sb.append(str.charAt(i));
            }
        }
        // Fix 4: Added parentheses to toString()
        return sb.toString();
    }

    public static void main(String arg[]) {
        String str = "hii, i am asad";
        System.out.println(toUpperCase(str));
    }
}
