import java.util.Scanner;

public class String_day08 {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        String name = string.nextLine();
        // length of string
        System.out.println(name.length());


        // First and Last char of string
        System.out.println(name.charAt(0)); // first char
        System.out.println(name.charAt(6)); // last char


        // replace a char
        System.out.println(name.replace("d","i"));


        // convert to uppercase and lowercase
        System.out.println(name.toLowerCase()); // replace all char in lowercase
        System.out.println(name.toUpperCase()); // replace all char in uppercase

    }
}
