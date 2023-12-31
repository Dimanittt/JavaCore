package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMethods3 {
    public static void main(String[] args) {
        String s1 = "12345678912345670325987;" +
                "98765432165498750921654;" +
                "85274196345612381122333";
        //03/25 1234 5678 9123 4567 (987) - bank card
        Pattern pattern
                = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})" +
                "(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(s1);

        String s2 = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
        System.out.println(s2);

//        while(matcher.find()){
//            System.out.println(matcher.group(7));
//        }
    }
}
