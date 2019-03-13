import comparators.CarComparatorByHoursePower;
import comparators.CarComparatorByPrise;
import models.Car;
import models.CarShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Car car_1 = new Car("Audi", 150, 2500, 5000);
    Car car_2 = new Car("Golf", 150, 4000, 10000);
    Car car_3 = new Car("BMW", 220, 2800, 7000);

    CarShop carShop = new CarShop(car_1, car_2, car_3);


    for (Car car : carShop) {
      System.out.println(car);
    }

    System.out.println();

    List<Car> cars = new ArrayList<>();
    Collections.addAll(cars, car_1, car_2, car_3);

    cars.sort(new CarComparatorByHoursePower()
            .thenComparing(new CarComparatorByPrise()));

    for (Car car : cars) {
      System.out.println(car);
    }
  }
}
