package Generics2;

public class ParametrizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hello");
        Info<Integer> info2 = new Info<>(777);
        System.out.println(info1);
        System.out.println(info2);
        System.out.println();
        Pair<String, Integer> pair1 = new Pair<>("Wow, it's ", 777);
        System.out.println(pair1.getValue1() + pair1.getValue2());
    }
}

class Info <T> {
    private T value;

    public Info(T value){
        this.value=value;
    }

    @Override
    public String toString() {
        return "[{" + value + "}]";
    }

    public T getValue(){
        return value;
    }
}

class Pair<V1, V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}
