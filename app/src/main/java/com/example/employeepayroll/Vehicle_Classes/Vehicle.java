package com.example.employeepayroll.Vehicle_Classes;

import java.io.Serializable;

public abstract class Vehicle implements Serializable {
    private String company;
    private String plate;
    private String colour;
    private int year;

    public Vehicle()
    {

    }

    public Vehicle(String company, String plate, String colour, int year) {
        this.company = company;
        this.plate = plate;
        this.colour = colour;
        this.year = year;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }


}
