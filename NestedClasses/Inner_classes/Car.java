package NestedClasses.Inner_classes;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public class Engine{
        int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
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

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine){
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
        Car car = new Car("grey", 5);
        Car.Engine engine1 = car.new Engine(81);
        car.setEngine(engine1);
        System.out.println("car: " + car);
        Car.Engine engine2 = new Car("black", 3).new Engine(79);
        System.out.println("engine2: " + engine2);
    }
}
