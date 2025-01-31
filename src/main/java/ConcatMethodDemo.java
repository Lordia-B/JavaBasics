import java.util. *;

public class ConcatMethodDemo {

    public static void main(String[] args) {
        String hello = "Hello";
        hello = hello + " World";
        String name = "\"Lordia\"";
        String message = "Java is fun!";

        /*int intValue = 45;
        double doubleValue = 45.8;
        boolean boolValue = true;

        int length1 = name.length();
        int length2 = hello.length();

        System.out.println(message.charAt(2));
        String str1 = String.valueOf(intValue);
        String str2 = String.valueOf(doubleValue);
        String str3 = String.valueOf(boolValue);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3); */

        String text = "Java is fun!";
        String caps = text.toUpperCase();
        boolean starts = text.startsWith("Just");

        String string1 = text.substring(7);


        System.out.println(string1);

        System.out.println(caps);



    }
}
