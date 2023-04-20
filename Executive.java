/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.mavenproject1;

/**
 *
 * @author sayed
 */
public class Executive extends Employees{
    private String dept;
    
    public Executive(){
        super();
        
        dept = "unkown";
        
    }
    public void insertData(String dept, int Employees_no, String name, String address, String tel_no){
        super.insertData(Employees_no, name, address, tel_no);
        this.dept = dept;
    }
    
    public void displayData(){
        super.displayData();
        System.out.println("Employee's Department: " + dept);
    }
    
    
}
