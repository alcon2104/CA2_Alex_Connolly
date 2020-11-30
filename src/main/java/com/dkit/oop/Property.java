package com.dkit.oop;

import java.util.ArrayList;
import java.util.Objects;

public class Property
{
    private int propertyID;
    private String owner;
    private String postcode;
    private double sellingPrice;
    private double area;
    private ArrayList facilities;


    public Property(int propertyID, String owner, String postcode, double area, ArrayList facilities)
    {
        this.propertyID = propertyID;
        this.owner = owner;
        this.postcode = postcode;
        this.sellingPrice = 150000;
        this.area = area;
        this.facilities = facilities;
    }

    public Property(int propertyID, String owner, String postcode, double sellingPrice, double area, ArrayList facilities)
    {
        this.propertyID = propertyID;
        this.owner = owner;
        this.postcode = postcode;
        this.sellingPrice = sellingPrice;
        this.area = area;
        this.facilities = facilities;
    }

    public int getPropertyID()
    {
        return propertyID;
    }

    public void setPropertyID(int propertyID)
    {
        this.propertyID = propertyID;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public String getPostcode()
    {
        return postcode;
    }

    public void setPostcode(String postcode)
    {
        this.postcode = postcode;
    }

    public double getSellingPrice()
    {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice)
    {
        this.sellingPrice = sellingPrice;
    }

    public double getArea()
    {
        return area;
    }

    public ArrayList getFacilities()
    {
        return facilities;
    }

    public void setArea(double area)
    {
        this.area = area;
    }

    public void addFacility(String facility)
    {
        facilities.add(facility);
    }

    public void removeFacility(String facility)
    {
        facilities.remove(facility);
    }

    @Override
    public int hashCode()
    {
        return this.hashCode();
    }

    @Override
    public boolean equals(Object obj)
    {
        return this.equals(obj);
    }

    @Override
    public String toString()
    {
        return "Property{" +
                "PropertyID=" + propertyID +
                ", ownerName='" + owner + '\'' +
                ", postcode='" + postcode + '\'' +
                ", sellingPrice=" + sellingPrice +
                ", area=" + area +
                ", facilities=" + facilities +
                '}';
    }

    public double calculateTax(double area)
    {
        double basicCharge = 15.00;

        double areaCharge = this.area * 2.2;

        basicCharge += areaCharge;

        return basicCharge;
    }
}
