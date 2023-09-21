package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern1 = Pattern.compile("ABC");


//        String s1 = "OPABMNCD";
//        Pattern pattern1 = Pattern.compile("[ABC]");

//        String s1 = "ABDOP";
//        String s1 = "ABCOPAB7OP";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[e-g4-7]");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[^e-g4-7]"); // ^ is a negation

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc(e|5)");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc."); //except \n

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("^abc"); //seeks for an expression at the start of the line

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("6abch$"); //seeks for an expression at the end of the line

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\d"); // [0-9]

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\D"); // [a-zA-Z]  and space

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w"); // [a-zA-Z0-9] except of space

//        String s1 = "abcd!?abce=====abc++ 5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\W+"); // upside down

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w+"); // + - mathicng symbols from range

//        String s1 = "Hello dom Name dom Dmitry dom Home dom 1234 What Olesya abstrakcionism";
//        Pattern pattern1 = Pattern.compile("\\w{4}"); // matching for {count} symbols

//        String s1 = "Hello     Name      Dmitry          Home  1234 What    Olesya abstrakcionism";
//        Pattern pattern1 = Pattern.compile("\\w\\s+\\w"); // \\s - [\t\n\r\f]

//        String s1 = "abcd abce3 abcfa78abcg6abch!!!!!!!!!!";
//        Pattern pattern1 = Pattern.compile("\\D{2,6}"); // \D - non digit

//        String s1 = "abcd abce3 abcfa78abcg6abch!!!!!!!!!!";
//        Pattern pattern1 = Pattern.compile("\\D{2,}"); // {2,} - range from 2 to infinite

//        String s1 = "ABCABABDA";
//        Pattern pattern1 = Pattern.compile("AB{2,3}"); // {2,3} to B only

//        String s1 = "ABCABABDA";
//        Pattern pattern1 = Pattern.compile("(AB){2,3}"); // {2,3} to whole expression

//        String s1 = "DABCDABABDABABABD";
//        Pattern pattern1 = Pattern.compile("D(AB){2,}");

//        String s1 = "DABCDABABDABABABD";
//        Pattern pattern1 = Pattern.compile("D(AB)?"); // ? - 0 or 1 match

//        String s1 = "DABCDABABDABABABD";
//        Pattern pattern1 = Pattern.compile("D(AB)*"); // * - 0 or more match

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\Aabc"); // \A - at the start of the String

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abch\\Z"); // \Z - at the end of the String

        String s1 = "abcd abce abc5abcg6abch";
        Pattern pattern1 = Pattern.compile("abch\\Z"); // \Z - at the end of the String


        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position " + matcher.start() + " " + matcher.group());
        }


    }
}
