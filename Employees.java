/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.mavenproject1;

/**
 *
 * @author sayed
 */
public class Employees {
    private int Employee_no;
    private String name;
    private String address;
    private String tel_no;
    
    public Employees(){
         Employee_no = 0;
         name = "John Doe";
         address = "nowhere";
         tel_no = "n/a";
    }
    public void insertData(int Emp_no, String name, String address, String tel_no){
        this.Employee_no = Emp_no;
        this.name = name;
        this.address = address;
        this.tel_no = tel_no;
        
    }
    public void displayData(){
        System.out.println("Employee's Number : " + Employee_no);
        System.out.println("Employee's address : " + address);
        System.out.println("Employee's name : " + name);
        System.out.println("Employee's Tel Number : " + tel_no);



        
    }
    
    
}
