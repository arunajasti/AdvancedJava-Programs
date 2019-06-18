package com.aruna.database.Jdbc.dao;

import java.util.List;

import com.aruna.database.Jdbc.domain.Employee;

public interface IEmployeeDao 
{
List<Employee> getEmployeeDetails(int salary);
}
