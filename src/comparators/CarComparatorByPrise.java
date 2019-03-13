package comparators;

import models.Car;

import java.util.Comparator;

public final class CarComparatorByPrise implements Comparator<Car> {

  @Override
  public int compare(Car car_1, Car car_2) {
    return Integer.compare(car_2.getPrice(), car_1.getPrice());
  }
}