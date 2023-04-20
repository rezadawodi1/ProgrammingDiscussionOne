/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.mavenproject1;

/**
 *
 * @author sayed
 */
public abstract class MotorVehicle {
    protected String modelName;
    protected int modelNumber;
    protected double modelPrice;
    
    public void MotorVehicle(String modelName, int modelNumber, double modelPrice){
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;
    }
    
    public abstract void display();
}
