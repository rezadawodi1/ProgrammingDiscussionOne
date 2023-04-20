/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.mavenproject1;

/**
 *
 * @author sayed
 */
public class Car extends MotorVehicle {
    private double discountRate;
    public Car(String modelName, int modelNumber, double modelPrice, double discountRate){
        super.MotorVehicle(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;
    }

    @Override
    public void display() {
        System.out.println("The Model's Name is " + modelName);
        System.out.println("The Model's Number is " + modelNumber);
        System.out.println("The Model's Price is " + modelPrice);
        System.out.println("The discount rate is " + discountRate);
        
    }
    public double discount(){
        return modelPrice * (discountRate/100);
    }
    
    
    public static void main(String[] args){
        Car car = new Car("toytal",55, 100.1,44.5);

        car.display();
        System.out.printf("The price of discount is %.2f", car.discount());
    }
    
    
}
