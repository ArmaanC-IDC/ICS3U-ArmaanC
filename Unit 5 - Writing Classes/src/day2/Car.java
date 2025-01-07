package day2;

public class Car {
    private String make;
    private String model;
    private int year;
    private double mileage;

    public Car(String make, String model, int year, int mileage){
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public double getMileage(){
        return mileage;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setMileage(double mileage){
        this.mileage = mileage;
    }

    public void displayCarDetails(){
        System.out.println("Make: " + make + " Model: " + model + " Year" + year + " Mileage" + mileage);
    }

    public void drive(double milesDriven){
        this.mileage += milesDriven;
        System.out.println("Updated mileage: " + this.mileage);
    }
}
