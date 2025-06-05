public class StringClassMethods {

    public static void main(String[] args) {

        // charAt
//        String str = "Hello world";
//        System.out.println(str.charAt(3)); // l
//        System.out.println(str.charAt(8)); // r

        // length
//        String str1 = "abc";
//        System.out.println(str1.length()); // 3
//
//        String str2 = "Hello world";
//        System.out.println(str2.length()); // 11

        // indexOf
//        String str2 = "Hello World";
//        System.out.println(str2.indexOf('W')); // 6
//        System.out.println(str2.indexOf("ll")); // 2
//        System.out.println(str2.indexOf("abc")); // -1

        // equals
//        String str = "Hello World";
//        String str2 = new String("Hello World");
//        System.out.println(str.equals(str2)); // true
//        System.out.println(str == str2);  // false

        // contains
//        String str = "Hello World";
//        System.out.println(str.contains("ll")); // true
//        System.out.println(str.contains("abc")); // false

        // toLowerCase toUpperCase
//        String str = "Hello World";
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());

        // replace
//        String str = "I love Programming";
//        String str2 = str.replace("Programming", "Java");
//        System.out.println(str);
//        System.out.println(str2);

        // substring
//        String str = "I love Programming. Programming is awesome";
//
//        // start at index = 7 and extract till the end
//        String sub = str.substring(7);
//        System.out.println(sub);
//
//        // start at index = 2 and extract chars till index < 6
//        String sub2 = str.substring(5, 8);
//        System.out.println(sub2);

        // concatenation
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;
        System.out.println(str3);

        int x = 5;
        System.out.println(str1 + x);

        int[] array = {5, 4, 2};
        System.out.println(array + "");

    }
}
