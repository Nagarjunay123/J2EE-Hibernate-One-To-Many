package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Company;
import dto.Employee;

public class CompanyDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Nag");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insertBoth(Company company) {
//		List<Employee> list=company.getEmployee();
		
		entityTransaction.begin();
		
//		for(Employee employee:list) {
//			entityManager.persist(employee);
//		}
		entityManager.persist(company);
		
		entityTransaction.commit();
	}
	
	public void updateAll(int id,Company company) {
//		company.setCompanyId(id);
//		List<Employee> list=company.getEmployee();
		entityTransaction.begin();
		
//		for(Employee employee:list) {
//			entityManager.merge(employee  );
//		}
		entityManager.merge(company);
		entityTransaction.commit();
	}
	public void deleteById(int id) {
		Employee employee=entityManager.find(Employee.class,id);
		
		entityTransaction.begin();
		entityManager.remove(employee);
		entityTransaction.commit();
	}
	
	public void findAll() {
		Query query=entityManager.createQuery("select c from Company c");
		List list=query.getResultList();
		
		System.out.println(list);
	}
	
	public void findById(int companyId) {
		Company company=entityManager.find(Company.class,companyId);
		System.out.println(company);
	}
	
	public void deleteByName(String name) {
		Query query=entityManager.createQuery("select e from Employee e where e.employeeName=?1");
		query.setParameter(1, name);
		List<Employee> list=query.getResultList();
		
		entityTransaction.begin();
		for(Employee e:list) {
			entityManager.remove(e);
		}
		
		entityTransaction.commit();
	}
}
