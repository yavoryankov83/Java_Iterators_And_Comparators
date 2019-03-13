package models;

import java.util.*;

public class CarShop implements Iterable<Car> {

  private List<Car> cars;

  public CarShop(Car... cars) {
    this.cars = Arrays.asList(cars);
  }

  public List<Car> getCars() {
    return cars;
  }

  private void setCars(List<Car> cars) {
    this.cars = cars;
  }

  @Override
  public Iterator<Car> iterator() {
    return new CarIterator();
  }

  private final class CarIterator implements Iterator<Car>{

    private int count;

    @Override
    public boolean hasNext() {
      return this.count < getCars().size();
    }

    @Override
    public Car next() {
      return getCars().get(count++);
    }
  }
}
