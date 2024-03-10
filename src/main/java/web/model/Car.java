package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String model;
    private int series;
    private String color;

    public Car() {
    }

    public Car(String model, int series, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static List<Car> carList() {
        List<Car> carList = new ArrayList<>();

        Car car1 = new Car("Lada", 2110, "Cherry");
        Car car2 = new Car("Lamborghini", 417, "white");
        Car car3 = new Car("Opel Corsa", 996, "red");
        Car car4 = new Car("Kia Stinger", 793, "blue");
        Car car5 = new Car("Volkswagen Polo", 638, "grey");

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

        return carList;
    }

    @Override
    public String toString() {
        return "Car: " +
                "model= " + model +
                ", series= " + series +
                ", color= " + color +
                ';';
    }
}
