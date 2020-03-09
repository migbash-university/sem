package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
    }

    @Test
    void printSalariesTest_Null()
    {
        app.printSalaries(null);
    }

    @Test
    void printSalariesTest_Empty() {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        app.printSalaries(employees);
    }

    @Test
    void printSalariesTest_ContainsNull() {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(null);
        app.printSalaries(employees);
    }

    @Test
    void printSalariesTest_ExpectedInput() {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee emp = new Employee();
        emp.emp_no = 1;
        emp.first_name = "Kevin";
        emp.last_name = "Chalmers";
        emp.title = "Engineer";
        emp.salary = 55000;
        employees.add(emp);
        app.printSalaries(employees);
    }

    // Employees Tests

    @Test
    void displayEmployeeTest_Null() {
        app.displayEmployee(null);
    }

    @Test
    void displayEmployeeTest_Empty(){
        Employee emp = new Employee();
        app.displayEmployee(emp);
    }

    @Test
    void displayEmployeeTest_ContainsNull(){
        Employee emp = new Employee();
        emp.title = null;
        app.displayEmployee(emp);
    }

    @Test
    void displayEmployeeTest_ExpectedInput(){
        Employee emp = new Employee();
        emp.emp_no = 213124;
        emp.first_name = "Miguel";
        emp.last_name = "Bacharov";
        app.displayEmployee(emp);
    }

}
