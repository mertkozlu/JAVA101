package Kodlamaio.KodlaWithNlayeredApp.Entities;

public class Course {
    private int id;
    private String name;
    private double price;

    public Course() {
    }

    public Course(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
