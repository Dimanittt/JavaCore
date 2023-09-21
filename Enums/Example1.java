package Enums;

public class Example1 {
    void method(String dayOfWeek){
        System.out.println("Today is " + dayOfWeek);
    }

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        example1.method("Hello");
    }
}
