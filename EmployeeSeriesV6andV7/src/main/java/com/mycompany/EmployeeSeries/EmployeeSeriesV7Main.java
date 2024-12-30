/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EmployeeSeries;

/**
 *
 * @author jl
 */
public class EmployeeSeriesV7Main {

    public static void main(String[] args) {
        com.mycompany.EmployeeSeries.version6.HourlyEmployee test1 = new com.mycompany.EmployeeSeries.version6.HourlyEmployee(1000, 400, new com.mycompany.EmployeeSeries.version6.EmpName("Stephanie","Recla","E."),new com.mycompany.EmployeeSeries.version6.Date(8,5,2004), new com.mycompany.EmployeeSeries.version6.Date(2024,9,15), 1001);
        com.mycompany.EmployeeSeries.version6.PieceWorkerEmployee test2 = new com.mycompany.EmployeeSeries.version6.PieceWorkerEmployee(50000, 50, new com.mycompany.EmployeeSeries.version6.EmpName("John Lorenz","Codilla","B"),new com.mycompany.EmployeeSeries.version6.Date(5,20,2004), new com.mycompany.EmployeeSeries.version6.Date(2024,9,15), 1002);
        com.mycompany.EmployeeSeries.version6.CommissionEmployee test3 = new com.mycompany.EmployeeSeries.version6.CommissionEmployee(5000.00, new com.mycompany.EmployeeSeries.version6.EmpName("Dusky","Saballa","S"),new com.mycompany.EmployeeSeries.version6.Date(5,5,2004), new com.mycompany.EmployeeSeries.version6.Date(2024,9,15), 1003);
        com.mycompany.EmployeeSeries.version6.BasePlusCommissionEmployee test4 = new com.mycompany.EmployeeSeries.version6.BasePlusCommissionEmployee(15000.00, 2000, new com.mycompany.EmployeeSeries.version6.EmpName("Crazy","Person","Buang"),new com.mycompany.EmployeeSeries.version6.Date(3,5,2004), new com.mycompany.EmployeeSeries.version6.Date(2024,9,15), 1004);
//        test1.display();
//        test2.display();
//        test3.display();
//        test4.display();
        
        com.mycompany.EmployeeSeries.version6.EmployeeRoster emplist = new com.mycompany.EmployeeSeries.version6.EmployeeRoster();
        emplist.addEmployee(test1);
        emplist.addEmployee(test2);
        emplist.addEmployee(test3);
        emplist.addEmployee(test4);
        
        System.out.printf("Count of CE: %d\n",emplist.countCE());
        System.out.printf("Count of PWE: %d\n",emplist.countPWE());
        System.out.printf("Count of BPCE: %d\n",emplist.countBPCE());
        System.out.printf("Count of HE: %d\n",emplist.countHE());
        
        emplist.displayAllEmployee();
        
        emplist.removeEmployee(1003);
        emplist.displayAllEmployee();
        
        System.out.printf("Count of CE: %d\n",emplist.countCE());
        System.out.printf("Count of PWE: %d\n",emplist.countPWE());
        System.out.printf("Count of BPCE: %d\n",emplist.countBPCE());
        System.out.printf("Count of HE: %d\n",emplist.countHE());
    }
}

