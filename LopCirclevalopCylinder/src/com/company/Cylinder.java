package com.company;

import javax.naming.ldap.PagedResultsControl;
import java.net.PortUnreachableException;

public class Cylinder extends Circle {
    private double Highquality;

    public Cylinder() {

    }

    public Cylinder(double radius, String color, double Hightquality) {
        super(radius, color);
        this.Highquality = Hightquality;
    }
    public double getHighquality(){
        return this.Highquality=Highquality;
    }
    public void setHighquality(double Hightquality){
        this.Highquality=Hightquality;
    }
    public double getVolume() {
        return this.Highquality * Math.PI * super.getRadius() * super.getRadius();
    }
    @Override
    public String toString(){
        return "Radius: "+super.getRadius()+"\n"+"Color: "+super.getColor()+"\n"+"Highquality: "+ getHighquality()+
                "\n"+"GetVolume: "+ getVolume();
    }
}
