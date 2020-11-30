package com.dkit.oop;

import java.util.ArrayList;

/**
 * OOP - CA#2 - Nov 2020
 * Your Name:
 * <p>
 * Your GitHub link:
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("\n*** Property & Private Property- - App ***");
        App app = new App();
        app.start();
    }

    public void start() {
        System.out.println("Q1 - some simple tests");

        Property p1 = new Property(1, "Mary Smith", "A91AB12", 255000, new ArrayList());
        p1.addFacility("mains");
        p1.addFacility("electricity");
        //System.out.println("Property p1 details:");
        //System.out.println(p1.getPropertyID() + " : " + p1.getOwner() + " : " + p1.getPostcode() + " : " + p1.getSellingPrice() + " : " + p1.getArea() + " : " + p1.getFacilities());
        p1.removeFacility("mains");
        //System.out.println("Property p1 details:");
        //System.out.println(p1.getPropertyID() + " : " + p1.getOwner() + " : " + p1.getPostcode() + " : " + p1.getSellingPrice() + " : " + p1.getArea() + " : " + p1.getFacilities());

        //System.out.println("Property #1 tax = " + p1.calculateTax(p1.getArea()));

        System.out.println("Q2 - tests");

        ArrayList<Property> properties = new ArrayList<Property>();
        Property p2 = new Property(2, "John Loane", "A92YYE4", 158000, 152000, new ArrayList());
        p2.addFacility("mains");

        Property p3 = new Property(3, "Alex Connolly", "A92CCD3", 250000, 198000, new ArrayList());
        p3.addFacility("electricity");
        p3.addFacility("freehold");

        properties.add(p1);
        properties.add(p2);
        properties.add(p3);

        displayProperties(properties);
        ArrayList<Property> propertiesAbovePrice;
        propertiesAbovePrice = getPropertiesPriceAbove(properties, 155000);
        for (int i = 0; i < propertiesAbovePrice.size(); i++) {
            //System.out.println(propertiesAbovePrice.get(i).toString());
        }


        System.out.println("Q3 - tests");
        PrivateProperty pp1 = new PrivateProperty(4, "Harry Totter", "A74UUT2", 110000, 120000, new ArrayList(), 1, "Apartment");
        //System.out.println("Private Property #1: numBeds = " + pp1.getNumBeds() + ", tax due = " + pp1.calculateTax(p1.getArea(), pp1.getNumBeds()));


        System.out.println("Q4 - tests");
        PrivateProperty pp2 = new PrivateProperty(5, "Amy Addams", "A64HHP8", 310000, 240000, new ArrayList(), 2, "Semi-D");
        PrivateProperty pp3 = new PrivateProperty(6, "Johnny Prepp", "A43GGU7", 540000, 360000, new ArrayList(), 4, "Detached");
        pp1.addFacility("mains");
        pp1.addFacility("Private access");
        pp2.addFacility("mains");
        pp3.addFacility("Private access");
        pp3.addFacility("electricity");

        properties.add(pp1);
        properties.add(pp2);
        properties.add(pp3);
        displayProperties(properties);


        for (int i = 0; i < properties.size(); i++)
        {
            System.out.println("Private Property #" + properties.get(i).getPropertyID() + ": Property ID = "
            + properties.get(i).getPropertyID() + ", tax due = " + properties.get(i).calculateTax(properties.get(i).getArea()));
        }

    }

    private void displayProperties(ArrayList<Property> properties)
    {
        for(int i = 0; i < properties.size(); i++)
        {
            System.out.println(properties.get(i).toString());
        }
    }

    private ArrayList getPropertiesPriceAbove(ArrayList<Property> properties, int boundaryPrice)
    {
        ArrayList<Property> validProps = new ArrayList<>();
        for(int i = 0; i < properties.size(); i++)
        {
            if(properties.get(i).getSellingPrice() >= boundaryPrice) {
                validProps.add(properties.get(i));
            }
        }
        return validProps;
    }
}

