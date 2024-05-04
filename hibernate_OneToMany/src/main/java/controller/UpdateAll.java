package controller;

import java.util.ArrayList;
import java.util.List;

import dao.CompanyDao;
import dto.Company;
import dto.Employee;

public class UpdateAll {

	public static void main(String[] args) {


		Company company=new Company();
		company.setCompanyName("Wipro");
		company.setCompanyAddress("BLR");
		company.setCompanyEmail("Wipro@gmail");
		company.setCompanyPhone(9994567890l);
		
		Employee employee=new Employee();
		employee.setEmployeeId(1);
		employee.setEmployeeName("raja");
		employee.setEmployeeAge(24);
		employee.setEmployeeAddress("chennai");
		employee.setEmployeeSalary(25000);
		employee.setEmployeephone(1234543299l);
		
		Employee employee1=new Employee();
		employee1.setEmployeeId(2);
		employee1.setEmployeeName("rani");
		employee1.setEmployeeAge(22);
		employee1.setEmployeeAddress("gurugram");
		employee1.setEmployeeSalary(20000);
		employee1.setEmployeephone(9934583210l);
		
		Employee employee2=new Employee();
		employee2.setEmployeeId(3);
		employee2.setEmployeeName("raju");
		employee2.setEmployeeAge(28);
		employee2.setEmployeeAddress("hyd");
		employee2.setEmployeeSalary(45000);
		employee2.setEmployeephone(987773210l);
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(employee);
		list.add(employee1);
		list.add(employee2);
		
		company.setEmployee(list);
		
		CompanyDao companyDao=new CompanyDao();
		companyDao.updateAll(1, company);
	}

}
