package controller;

import java.util.ArrayList;
import java.util.List;

import dao.CompanyDao;
import dto.Company;
import dto.Employee;

public class InsertBoth {

	public static void main(String[] args) {
		
		Company company=new Company();
		company.setCompanyName("tcs");
		company.setCompanyAddress("hyd");
		company.setCompanyEmail("tcs@gmail");
		company.setCompanyPhone(1234567890l);
		
		Employee employee=new Employee();
		employee.setEmployeeName("nag");
		employee.setEmployeeAge(22);
		employee.setEmployeeAddress("kmm");
		employee.setEmployeeSalary(22000);
		employee.setEmployeephone(1234543210l);
		
		Employee employee1=new Employee();
		employee1.setEmployeeName("vijay");
		employee1.setEmployeeAge(23);
		employee1.setEmployeeAddress("hyd");
		employee1.setEmployeeSalary(25000);
		employee1.setEmployeephone(9934543210l);
		
		Employee employee2=new Employee();
		employee2.setEmployeeName("vardan");
		employee2.setEmployeeAge(24);
		employee2.setEmployeeAddress("ap");
		employee2.setEmployeeSalary(25000);
		employee2.setEmployeephone(987543210l);
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(employee);
		list.add(employee1);
		list.add(employee2);
		
		company.setEmployee(list);
		
		
		CompanyDao companyDao=new CompanyDao();
		companyDao.insertBoth(company);
	}
}
