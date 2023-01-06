package oop.model;

public class Car {
    public String model; //default arjeky null e
    private double engine;// double default arjeky 0.0 e
    public int year; //int i default arjeky 0 e


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
