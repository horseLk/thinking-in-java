package chap03_operator.question14;

public class StringCompare {
    public static void compare(String s1, String s2) {
        System.out.println("s1 == s2? " + (s1 == s2));
        System.out.println("s1 != s2? " + (s1 != s2));
        System.out.println("s1 equals s2? " + (s1.equals(s2)));
    }
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = "bcd";

        compare(a, b); // rue, false, true
        System.out.println("-----");
        compare(a, c); // false, true, false
    }
}
