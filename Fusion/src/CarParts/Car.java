package CarParts;

import java.util.ArrayList;

public class Car extends PartInfo{
    //data fields
    private int id;
    private String make;
    private String model;
    private int year;
    public Car() {}

    public Car( int id, String make, String model, int year) {
        super();
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(int id, String make, String model, int year, int partNumber, String partName, String usedPart, String newPart, String images,String location) {
        super(partNumber, partName, usedPart, newPart, images,location);
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public int getId(){
        return id;
    }
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        String outPut = "";
        outPut += "Make: " + this.make + " Model: " + this.model + " Year: " + this.year;
        outPut += " " + super.toString();
        return outPut;
    }
}