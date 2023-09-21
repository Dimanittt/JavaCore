package RegEx;

import java.util.regex.Pattern;

public class StringMethods1 {

    static void checkIp(String ip){
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        System.out.println(ip + " is OK? " + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {
        //0-255.0-255.0-255.0-255
        checkIp("23.253.96.11");
    }
}
