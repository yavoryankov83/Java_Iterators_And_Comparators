package models;

import java.util.Iterator;

public class Car implements Comparable<Car> {

  private String name;
  private int hoursePower;
  private int taxesToPay;
  private int price;

  public Car(String name, int hoursePower, int taxesToPay, int price) {
    this.name = name;
    this.hoursePower = hoursePower;
    this.taxesToPay = taxesToPay;
    this.price = price;
  }

  public int getHoursePower() {
    return hoursePower;
  }

  private void setHoursePower(int hoursePower) {
    this.hoursePower = hoursePower;
  }

  public int getTaxesToPay() {
    return taxesToPay;
  }

  private void setTaxesToPay(int taxesToPay) {
    this.taxesToPay = taxesToPay;
  }

  public int getPrice() {
    return price;
  }

  private void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();

    builder
            .append("Car Name: ")
            .append(this.name)
            .append(", hoursePower: ")
            .append(this.hoursePower)
            .append(", taxesToPay: ")
            .append(this.taxesToPay)
            .append(", price: ")
            .append(this.price);

    return builder.toString();
  }

  @Override
  public int compareTo(Car other) {
    if (this.hoursePower == other.hoursePower) {
      return this.price - other.price;
    }

    return this.hoursePower - other.hoursePower;
  }
}
