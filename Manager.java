/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author sayed
 */
public class Manager extends Employees {
    private String job_title;
    private String companyCar;
    
    public Manager(){
        job_title = "unkown";
        companyCar = "unkown";
    }
    public void insertData(String job_title, String companyCar){
        this.job_title = job_title;
        this.companyCar = companyCar;
    }
    public void displayData(){
        System.out.println("Employee's Job_Title: " + job_title);
        System.out.println("Employee's Co Car: " + companyCar);

    }
    
    public static void main(String[] args){
        Employees emp = new Employees();
        emp.insertData(344,"John Doe","nowwhere","n/a");
        emp.displayData();
        
        Manager mag = new Manager();
        
        System.out.println("");
        System.out.println("Enter Employees Job Title: ");
        Scanner jt = new Scanner(System.in);
        String jon_tit = jt.next();
        
        System.out.println("Enter Company's Car: ");
        Scanner comcar = new Scanner(System.in);
        String compcar = comcar.next();
        
        mag.insertData(jon_tit, compcar);
        
        mag.displayData();



        
        
    }
    
}
