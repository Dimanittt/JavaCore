package NestedClasses.Anonymous_classes;

public class AnonClasses {

    private int c = 5;

    public static void main(String[] args) {
        Math math1 = new Math() {

            @Override
            public int doOperation(int a, int b) {
                AnonClasses ac = new AnonClasses();
                return a+b+ac.c;
            }
        };

        Math math2 = new Math() {

            @Override
            public int doOperation(int a, int b) {
                return a*b;
            }
        };

        System.out.println("math1.doOperation(3,6): " + math1.doOperation(3,6));
        System.out.println("math2.doOperation(3,6): " + math2.doOperation(3,6));

    }
}

interface Math {
    int doOperation(int a, int b);
}
