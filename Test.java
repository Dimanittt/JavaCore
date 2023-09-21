

public class Test {
    int a = 5;

    void method(int a){
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        NestedClasses.Test test = new NestedClasses.Test();
    }
}
