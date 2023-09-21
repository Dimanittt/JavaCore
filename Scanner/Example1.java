package Scanner;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Write a number ");
//        int a = scanner.nextInt();
//        System.out.println("Your number is " + a);

//        System.out.print("Write two numbers ");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        System.out.println("Division equals " + x/y);
//        System.out.println("Divider equals " + x%y);

//        System.out.println("Write a phrase");
//        String s = scanner.next();
//        System.out.println("Your phrase is: " + s);

//        System.out.println("Write a fractional number");
//        double d = scanner.nextDouble();
//        System.out.println("You fractional number is " + d);

        Scanner scanner1 = new Scanner("Hello my friend \nHow is it going? \nFine? So am i");

//        String s1 = scanner1.nextLine();
//        System.out.println(s1);
//        while(scanner1.hasNextLine()){
//            System.out.println(scanner1.nextLine());
//        }

        System.out.println(scanner1.next().charAt(4));
    }
}
