package RegEx;

public class StringMethods2 {

    public static void main(String[] args) {
        String s1 = "Hello     my  friend!      How's your Java       practice? for";
        System.out.println(s1);

//        s1 = s1.replace("Java", "SQL");
//        System.out.println(s1);
//
        s1 = s1.replaceAll(" {2,}", " ");
        System.out.println(s1);

//        s1 = s1.replaceAll("\\bf\\w+", "4444");
//        System.out.println(s1);

//        s1 = s1.replaceFirst("\\bf\\w+", "4444");
//        System.out.println(s1);
    }
}
