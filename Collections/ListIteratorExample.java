package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "1234543210";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) System.out.println("Palindrome");
        else System.out.println("Not palindrome");

        List<Character> list1 = new ArrayList<>();
        for (Character ch : s.toCharArray()) {
            list1.add(ch);
        }
        ListIterator<Character> listIterator = list1.listIterator(list1.size());
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " ");
        }
    }
}