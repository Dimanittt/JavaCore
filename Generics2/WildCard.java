package Generics2;

import java.util.*;

public class WildCard {


    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<Integer>();
    }
}
