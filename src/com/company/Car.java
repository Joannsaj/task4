package com.company;

class Vehicle {
    private String  model, brand,color;
    private int year, price,  quantity;

    public Vehicle(String model, String brand , String color, int year, int price, int quantity){
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }
    public void delivery(int n){
        quantity*=n;
    }
    public void sell(int n){
        quantity-=n;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    } public String getBrand(){
        return brand;
    }
    public void setBrand(String model){
        this.brand=brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
public class Car{
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle("v8","Land cruiser","black", 2021, 200000, 10);
        System.out.println(car1.toString());
        car1.sell(6);
        System.out.println(car1.getModel());
        System.out.println(car1.getBrand());
        System.out.println(car1.getColor());
        System.out.println(car1.getYear());
        System.out.println(car1.getPrice());
        System.out.println(car1.getQuantity());
        car1.setColor("blue");
        car1.setModel("M1");
        car1.setYear(2018);
        System.out.println(car1.toString());
    }
}
