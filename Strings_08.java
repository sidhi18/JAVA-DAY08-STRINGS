public class Strings_08 {
    public static void main(String[] args) {
        // string and it's method
      // 1. lenght (size) of string
        String name = "Siddhi";
        int a = name.length();
        System.out.println(a);
        //2. converting all elements  to loweercase
        System.out.println(name.toLowerCase());
        //3.converting all elements  to uppercase
        System.out.println(name.toUpperCase());
        //4. neglecting the space
        String name1 = "    Siddhi  ";
        System.out.println(name1.trim());
        //5. starts with given index number upto last index number
        System.out.println(name.substring(2));
        //6.starts with given index number i.e. 1(i) and excludes index no 4 (h) prints upto 1-3
        System.out.println(name.substring(1,4));
        //7.replace a charecter
        System.out.println(name.replace("d","r"));
        System.out.println(name.replace("dhi","itr"));
        System.out.println(name.replace("i","ei"));
        //8. gives true or false for operation
        System.out.println(name.startsWith("sid"));
        System.out.println(name.startsWith("Si"));
        System.out.println(name.startsWith("dhi"));
        //9.gives true or false for the following
        System.out.println(name.endsWith("i"));
        System.out.println(name.endsWith("dhi"));
        System.out.println(name.endsWith("d"));
        //10. to know char from it's place
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(2));
        // 11. to know index number from charecter
        System.out.println(name.indexOf("i"));
        System.out.println(name.indexOf("ddhi"));
        System.out.println(name.indexOf("h"));
        //12. to know index number for a particular range
        System.out.println(name.indexOf("i",3));
        System.out.println(name.indexOf("dd",2));
        System.out.println(name.indexOf("h",5));
        //13.to know index of last char
        System.out.println(name.lastIndexOf("dhi"));
        System.out.println(name.lastIndexOf("i"));
        System.out.println(name.lastIndexOf("h"));
        //14.to know the range of last index char
        System.out.println(name.lastIndexOf("ddhi",3));
        System.out.println(name.lastIndexOf("h",4));
        //15. equal method
        System.out.println(name.equals("sidhi"));
        System.out.println(name.equals("Siddhi"));
        //16.equal string by ignoring cases
        System.out.println(name.equalsIgnoreCase("siDDHi"));

    }
}
