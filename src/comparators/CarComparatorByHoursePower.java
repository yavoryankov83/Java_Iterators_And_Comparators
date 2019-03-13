package comparators;

import models.Car;

import java.util.Comparator;

public final class CarComparatorByHoursePower implements Comparator<Car> {

  @Override
  public int compare(Car car_1, Car car_2) {
    return car_1.getHoursePower() - car_2.getHoursePower();
  }
}
