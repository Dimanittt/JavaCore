package NestedClasses.Static_nested_classes;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public static class Engine{
        int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            System.out.println(a);
            this.horsePower = horsePower;
            countOfObjects++;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(89);
        System.out.println("engine: " + engine);
        Car car = new Car("grey", 5, engine);
        System.out.println("car: " + car);
        System.out.println(engine.countOfObjects);
    }
}
