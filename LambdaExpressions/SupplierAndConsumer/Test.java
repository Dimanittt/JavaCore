package LambdaExpressions.SupplierAndConsumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Test {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arrayList.add(carSupplier.get());
        }
        return arrayList;
    }

    public static void carConsumer(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> arrayList = createThreeCars(() -> new Car("VAZ 2109", "grey", 81));
        System.out.println(arrayList);

        carConsumer(arrayList.get(0), car -> {
            car.color = "black";
            car.model = "VAZ 2113";
            car.engine = 79;
            System.out.println("Downgraded car: " + car);
        });

        System.out.println(arrayList);
        System.out.println();

        arrayList.stream().forEach(x -> x.engine = 50);
        System.out.println(arrayList);
    }

}

class Car {
    String model;
    String color;
    int engine;

    public Car(String model, String color, int engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
