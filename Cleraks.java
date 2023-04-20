/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.mavenproject1;

/**
 *
 * @author sayed
 */
import java.util.Scanner;
public class Cleraks extends Employees{
    private float overtimeRate;
    private int overtimeHour;
    
    public Cleraks(){
        super();
        overtimeRate = 0;
        overtimeHour = 0;
    }
    
    public void insertData(float overtimeRate, int overtimeHour,int Emploees_no, String name, String address, String tel_no){
        this.overtimeRate = overtimeRate;
        this.overtimeHour = overtimeHour;
        super.insertData(Emploees_no, name, address, tel_no);
    }
    
    public void displayData(){
        super.displayData();
        System.out.println("Total overtime " + (overtimeRate * overtimeHour));
    }
    
    public static void main(String[] args){
       
        Executive Ex = new Executive();
        Cleraks C = new Cleraks();
        
        System.out.println("Executive --------------");
        Ex.displayData();
        
        System.out.println("Cleraks--------------");
        C.displayData();
        
        System.out.println("\nExecutive-------------");
        System.out.println("Enter Employee's Number: ");
        Scanner emp = new Scanner(System.in);
        int employees_no = emp.nextInt();

        System.out.println("Enter Employee's name: ");
        Scanner na = new Scanner(System.in);
        String name = na.next();

        System.out.println("Enter Employees address: ");
        Scanner add = new Scanner(System.in);
        String address = add.next();
        
        System.out.println("Enter Employees phone number: ");
        Scanner tel = new Scanner(System.in);
        String tel_no= tel.next();
 
        System.out.println("Enter Employee's department: ");
        Scanner depart = new Scanner(System.in);
        String dept = depart.next();

        System.out.println("Cleraks-------------");
        System.out.println("Enter Employee's Number: ");
        Scanner empt = new Scanner(System.in);
        int employees_not = empt.nextInt();

        System.out.println("Enter Employee's Name: ");
        Scanner nat = new Scanner(System.in);
        String namet = nat.next();
        
        System.out.println("Enter Employees address: ");
        Scanner addt = new Scanner(System.in);
        String addresst = addt.next();

        System.out.println("Enter Employees phone number: ");
        Scanner telt = new Scanner(System.in);
        String tel_not= telt.next();
        
        System.out.println("Enter Overtime Rate: ");
        Scanner over = new Scanner(System.in);
        float overtimerate = over.nextFloat();

        System.out.println("Enter Overtime hour: ");
        Scanner overh = new Scanner(System.in);
        int overtimehour = overh.nextInt();





        System.out.println("Executive-------------");

        Ex.insertData(dept, employees_no, name, address, tel_no);
        Ex.displayData();
        
        System.out.println("Cleraks--------------");
        C.insertData(overtimerate, overtimehour, employees_not, namet, addresst, tel_not);
        C.displayData();
        
        

    }
    
}
