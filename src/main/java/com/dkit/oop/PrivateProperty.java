package com.dkit.oop;

import java.util.ArrayList;
import java.util.Objects;

public class PrivateProperty extends Property
{
    private int numBeds;
    private String propertyType;

    public PrivateProperty(int propertyID, String owner, String postcode, double sellingPrice,
    double area, ArrayList facilities, int numBeds, String propertyType) {
        super(propertyID, owner, postcode, sellingPrice, area, facilities);
        this.numBeds = numBeds;
        this.propertyType = propertyType;
    }

    @Override
    public String toString() {
        return "Property{" +
                "PropertyID=" + super.getPropertyID() +
                ", ownerName='" + super.getOwner() + '\'' +
                ", postcode='" + super.getPostcode() + '\'' +
                ", sellingPrice=" + super.getSellingPrice() +
                ", area=" + super.getArea() +
                ", facilities=" + super.getFacilities() +
                ", numBeds=" + numBeds +
                ", propertyType=" + propertyType +
                '}';
    }

    /*In terms of equals(), including only owner and propertyID,
    * the owner Strings would be compared to see if they are the exact same in terms of charactrers,
    * and the propertyIDs would also be compared, but would use == instead of .equals()
    *
    * In terms of hashcode(), the hashcode of a value will be returned, i.e.
    * the location of it in the computer memory. This hashcode() method can be
    * used with the .equals() method to evaluate whether or not the hashcodes of
    * two Strings/Objects/ints are the exact same*/

    public double calculateTax(double area, int numBeds)
    {
        double basicCharge = 15.00;
        double areaCharge = this.getArea() * 2.2;
        double bedCharge = this.numBeds * 25.00;

        basicCharge = basicCharge + areaCharge + bedCharge;

        return basicCharge;

    }
}
