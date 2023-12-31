package RegEx;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
                "email: vivanov@mail.ru, Postcode: AA99, Phone Number: +123456789;" +
                "Petrova Mariya, Ukraine, Kiyev, Lomoonosov street, 33, Flat 18," +
                "email: masha@yandex.ru, Postcode: UKR54, Phone Number +987654321;" +
                "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21," +
                "email: chuck@gmail.com, Postcode: USA23, Phone number: +136478952.";

        String s2 = "chuck@gmail.com";
        boolean result = s2.matches("\\w+@\\w+\\.(ru|com)");
        System.out.println(result);

        String[] array = s1.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
